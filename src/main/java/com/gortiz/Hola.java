package com.gortiz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService obj = context.getBean(HelloWorldService.class);
		obj.hello();
		context.close();
	}

}
