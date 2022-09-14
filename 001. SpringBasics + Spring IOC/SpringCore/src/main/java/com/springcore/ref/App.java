package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a1 = (A) applicationContext.getBean("aref");
		System.out.println("\n" + a1);
		System.out.println("\n" + a1.getOb().getY());
		B b1 = (B) applicationContext.getBean("bref");
		System.out.println("\n" + b1);

	}
}
