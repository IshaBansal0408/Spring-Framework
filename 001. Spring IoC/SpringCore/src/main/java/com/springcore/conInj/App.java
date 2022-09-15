package com.springcore.conInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/conInj/personconfig.xml");
		Person p1 = (Person) applicationContext.getBean("person1");
		System.out.println("\n" + p1);
		
		Person p2 = (Person) applicationContext.getBean("person2");
		System.out.println("\n" + p2);
		
		Addition a1 = (Addition) applicationContext.getBean("add1");
		System.out.println();
		a1.doSum();
	}
}
