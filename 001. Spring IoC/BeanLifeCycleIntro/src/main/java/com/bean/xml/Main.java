package com.bean.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/bean/xml/config.xml");
		Pasta p1 =  (Pasta) applicationContext.getBean("p1");
		System.out.println("\n"+p1+"\n");
//		pre-shutdown hook needs to be setup
		applicationContext.registerShutdownHook();
	}
}
