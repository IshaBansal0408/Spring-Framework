package com.wire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/wire/xml/autoconfig.xml");
//		Student s1 =  (Student) applicationContext.getBean("stu1");
		Student s1 = applicationContext.getBean("stu1", Student.class);
		System.out.println("\n" + s1 + "\n");
	}
}
