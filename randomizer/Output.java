package com.ravindra.randomizer;

public class Output {
	private int number;
	private boolean isprime;
	
	public Output(int number, boolean isprime) {
		super();
		this.number = number;
		this.isprime = isprime;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isIsprime() {
		return isprime;
	}
	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}
}
