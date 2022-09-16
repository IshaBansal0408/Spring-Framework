package com.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.dao.StudentDao;
import com.springJdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springJdbc/config.xml");

//    	get jdbcTemplate
//    	JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
////    Insert Query
//    	String query = "insert into student(id,name,city) values(?,?,?)";
////    Fire Query
//    	int update = jdbcTemplate.update(query,3,"Farah Khanna","Mumbai");
//    	System.out.println(update + " records inserted.");

		StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
//    	Student s1 = new Student();
//    	s1.setId(5);
//    	s1.setName("Jay");
//    	s1.setCity("Banglore");
//    	int update = studentDao.insertData(s1);
//    	System.out.println(update + " records inserted.");

//    	Student s2 = new Student();
//    	s2.setId(2);
//    	s2.setName("George");
//    	s2.setCity("Italy");
//    	int update2 = studentDao.updateData(s2);
//    	System.out.println(update2 + " records updated.");

//    	studentDao.deleteData(3);

		Student student = studentDao.getStudentById(2);
		System.out.println(student);
		System.out.println("==============================================");
		List<Student> allStudents = studentDao.getAllStudents();
		for(Student stemp : allStudents) {
			System.out.println(stemp);
//			System.out.println("Id : "+ stemp.getId());
//			System.out.println("Name : " + stemp.getName());
//			System.out.println("City : "+stemp.getCity());
//			System.out.println("================================");
		}
	}
}
