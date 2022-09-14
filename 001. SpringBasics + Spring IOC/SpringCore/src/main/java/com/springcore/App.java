package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
//    	We will ask IoC Container to get the values - create ApplicationContext object
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//    	Ask for bean object
		Student s1 = (Student) applicationContext.getBean("student1");
//    	Extract the values
		System.out.println("\n" + s1);
		Student s2 = (Student) applicationContext.getBean("student2");
		System.out.println("\n" + s2);
		Student s3 = (Student) applicationContext.getBean("student3");
		System.out.println("\n" + s3);
		
		
	}
}
