package com.ravindra.randomizer;

import java.util.concurrent.ConcurrentLinkedQueue;

public class RandomizedPrime {
	public static void main(String args[]){
		ConcurrentLinkedQueue<Integer> inputqueue = new ConcurrentLinkedQueue<Integer>();
		ConcurrentLinkedQueue<Output> outputqueue = new ConcurrentLinkedQueue<Output>();
		System.out.println("Main Program Started");
		Thread randomizer= new Thread( new Randomizer(inputqueue, outputqueue));
		Thread prime= new Thread(new Prime(inputqueue,outputqueue));
		randomizer.start();
		prime.start();
	}

}
