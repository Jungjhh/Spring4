package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap07.Calculator;

public class MainXmlAspect {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopAspect.xml");
		Calculator implCal = ctx.getBean("implCal", Calculator.class);
		
		long fiveFact = implCal.factorial(5);
		System.out.println("implCal.factorial(5) = "+fiveFact);
	}

}
