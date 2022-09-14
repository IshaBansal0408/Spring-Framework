package com.bean.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/bean/annotation/config.xml");
		Pizza p1 =  (Pizza) applicationContext.getBean("p1");
		System.out.println("\n"+p1+"\n");
		applicationContext.registerShutdownHook();
		
	}
}
