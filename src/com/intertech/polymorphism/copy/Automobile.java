package com.intertech.polymorphism.copy;

public class Automobile {

	private static int vinCount = 3_818_202;
	private int VIN;

	public int getVIN() {
		return VIN;
	}

	public Automobile() {
		VIN = vinCount++;
	}

}
