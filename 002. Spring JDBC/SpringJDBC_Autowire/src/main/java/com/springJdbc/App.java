package com.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springJdbc.dao.StudentDao;
import com.springJdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);

		List<Student> allStudents = studentDao.getAllStudents();
		for (Student stemp : allStudents) {
			System.out.println(stemp);
		}
	}
}
