package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Greeter greeter = ctx.getBean("greeter", Greeter.class);
		
		String msg = greeter.greet("스프링");
		
		System.out.println(msg);
		
		ctx.close();
	}

}
