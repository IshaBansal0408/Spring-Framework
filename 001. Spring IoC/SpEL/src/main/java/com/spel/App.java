package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spel/config.xml");
		Demo d1 = applicationContext.getBean("demo", Demo.class);
		System.out.println("Value of d1 : " + d1);

		SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		Expression expression = spelExpressionParser.parseExpression("34+45");
		System.out.println("Value of Expression : " + expression.getValue());

	}
}
