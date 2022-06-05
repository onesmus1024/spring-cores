package com.springioc;

public class Safaricom implements Sim {

	@Override
	public void calling() {
		System.out.println("use safaricom air time to call my friends");
		
	}

	@Override
	public void browsing() {
		System.out.println("use safaricom data bunles to call browse");
		
	}

}
