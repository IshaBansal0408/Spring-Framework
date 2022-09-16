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
		Student s1 = new Student();
		s1.setId(8);
		s1.setName("Rohan");
		s1.setCity("Jammu");
		int update1 = studentDao.insertData(s1);
		System.out.println(update1 + " records inserted.");

		Student s2 = new Student();
		s2.setId(4);
		s2.setName("Harry");
		s2.setCity("Italy");
		int update2 = studentDao.updateData(s2);
		System.out.println(update2 + " records updated.");

		studentDao.deleteData(2);

		Student student = studentDao.getStudentById(5);
		System.out.println(student);
		System.out.println("==============================================");

		List<Student> allStudents = studentDao.getAllStudents();
		for (Student stemp : allStudents) {
			System.out.println(stemp);
		}
	}
}
