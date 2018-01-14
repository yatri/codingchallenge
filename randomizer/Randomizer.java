package com.ravindra.randomizer;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Randomizer implements Runnable {
	ConcurrentLinkedQueue<Integer> inputQueue;
	ConcurrentLinkedQueue<Output> outputQueue;

	public Randomizer(ConcurrentLinkedQueue<Integer> inputQueue, ConcurrentLinkedQueue<Output> outputQueue) {
		super();
		this.inputQueue = inputQueue;
		this.outputQueue = outputQueue;
	}

	@Override
	public void run() {
		Random r = new Random();
		System.out.println("Randomizer started");
		try {
			for (int i = 1; i < 10; i++) {
				int num = r.nextInt(100);
				inputQueue.add(num);
				System.out.println("Added to input queue from randomizer:" + num);
				Thread.currentThread().sleep(500);
				while (!outputQueue.isEmpty()) {
					Output output = outputQueue.poll();
					System.out.println(" Integer: " + output.getNumber() + " isPrime: " + output.isIsprime());

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
