package com.noXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		Movie m1 = applicationContext.getBean("getMovie", Movie.class);
		System.out.println(m1);
		m1.play();
	}
}
