package com.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sales {

	public static void main(String[] args) {
		
		
		System.out.print("This is dependency injection");
		
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	Buyer buy = context.getBean("buyer",Buyer.class);
	buy.Buy();

	}

}
