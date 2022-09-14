package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionconfig.xml");
		Emp emp1 = (Emp) applicationContext.getBean("emp1");
		System.out.println("\n" + emp1);

	}
}
