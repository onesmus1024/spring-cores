package com.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("bean.xml");
		
		System.out.println("happy to be using eclipse");
		
		Sim sim = context.getBean("safaricom",Safaricom.class);
		
		sim.calling();
		sim.browsing();

	}

}
