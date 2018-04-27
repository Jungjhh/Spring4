package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import config.JavaConfig;
import spring.Client;
import spring.Client2;
import spring.Client3;

public class Main {
	public static void main(String[] args) {
		
/*		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:springconf.xml");
		Client client = ctx.getBean("client", Client.class);
		client.send();
		
		ctx.close();*/
		/*
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:springconf.xml");
		Client2 client2 = ctx.getBean("client2", Client2.class);
		client2.send();
		
		ctx.close();*/
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Client3 client3 = ctx.getBean("client3", Client3.class);
		client3.send();
		ctx.close();
	}

}
