package com.noBean.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/noBean/component/config.xml");
		Student s1 = applicationContext.getBean("student", Student.class);
//		s1.setrNo(1);
//		s1.setName("Geeta");
		System.out.println("\n" + s1);
		System.out.println(s1.hashCode());
//		Using @Scope Annotation
		Student s2 = applicationContext.getBean("student", Student.class);
		System.out.println(s2.hashCode());
		System.out.println();
//		Using config XML class
		Teacher t1 = applicationContext.getBean("teach1", Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = applicationContext.getBean("teach1", Teacher.class);
		System.out.println(t2.hashCode());
	}
}
