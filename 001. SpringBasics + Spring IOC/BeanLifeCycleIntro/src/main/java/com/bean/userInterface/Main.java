package com.bean.userInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/bean/userInterface/config.xml");
		Pepsi p1 =  (Pepsi) applicationContext.getBean("pep1");
		System.out.println("\n"+p1+"\n");
		applicationContext.registerShutdownHook();
	}
}
