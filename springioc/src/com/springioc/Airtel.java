package com.springioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("use airtel air time to call my friends");
		
	}

	@Override
	public void browsing() {
		System.out.println("use airtel data bunbles to browse ");
		
	}

}
