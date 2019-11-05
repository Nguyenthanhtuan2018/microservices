package com.microservices.limitsservice.bean;

public class LimitConfiguration {

	private int maximum;
	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	private int minimum;
	
	public LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
}
