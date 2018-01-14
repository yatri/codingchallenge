package com.ravindra.randomizer;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Prime implements Runnable {

	ConcurrentLinkedQueue<Integer> inputqueue;
	ConcurrentLinkedQueue<Output> outputqueue;

	public Prime(ConcurrentLinkedQueue<Integer> inputqueue, ConcurrentLinkedQueue<Output> outputqueue) {
		this.inputqueue = inputqueue;
		this.outputqueue = outputqueue;
	}

	@Override
	public void run() {
		int num;
		System.out.println("Prime checker started");
		for(int i=0;i<10;i++){
			while(!inputqueue.isEmpty()){
				num=inputqueue.poll();
				Output output = new Output(num, isPrime(num));
				outputqueue.add(output);
			}
				try{
					Thread.currentThread().sleep(500);
					
				}
				catch(Exception e){e.printStackTrace();}
			
}
	}

	private boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
