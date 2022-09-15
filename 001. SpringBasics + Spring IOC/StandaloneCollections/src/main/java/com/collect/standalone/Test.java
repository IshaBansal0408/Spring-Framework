package com.collect.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/collect/standalone/config.xml");
		Person p1 = (Person) applicationContext.getBean("person1");
		System.out.println("\n" + p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println(p1.getLocations().getClass().getName());
		System.out.println(p1.getCourses().getClass().getName());
		System.out.println(p1.getCred().getClass().getName());
//		Person p2 = (Person) applicationContext.getBean("person2");
//		System.out.println("\n" + p2);
//		System.out.println(p2.getFriends().getClass().getName() + "\n");
	}
}
