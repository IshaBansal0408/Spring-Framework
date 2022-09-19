package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringBootJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringBootJpaExampleApplication.class, args);
		UserRepository userRepository = run.getBean(UserRepository.class);
//		User u1 = new User();
//		u1.setName("Jayan Sharma");
//		u1.setLocation("Mumbai");
//		u1.setDesignation("Developer");
//		User savedUser = userRepository.save(u1);
//		System.out.println(savedUser);
//		Insert new User
//		Save Single User
//		User user1 = new User();
//		user1.setName("Jenny Saxena");
//		user1.setLocation("Delhi");
//		user1.setDesignation("Tester");
//		User savedUser = userRepository.save(user1);
//		System.out.println(savedUser + "/n" + "Saved Successfully!");
//		Save Multiple Users
//		User user2 = new User();
//		user2.setName("Danny Josh");
//		user2.setLocation("Mumbai");
//		user2.setDesignation("UI Developer");
//		User user3 = new User();
//		user3.setName("Gina Goshwal");
//		user3.setLocation("Gujrat");
//		user3.setDesignation("Team Lead");
//		List<User> users = List.of(user2, user3);
//		List<User> saveAllUsers = userRepository.saveAll(users);
//		System.out.println(saveAllUsers + "\n" + "Multiple Users Saved Successfully!");
//		saveAllUsers.forEach(userTemp -> {
//			System.out.println(userTemp);
//		});
//		Update User
//		Optional<User> userFindById = userRepository.findById(2);
//		System.out.println(userFindById);
//		System.out.println(userFindById.get());
//		User userFound = userFindById.get();
//		userFound.setDesignation("Developer");
//		User savedUser = userRepository.save(userFound);
//		System.out.println(savedUser);
//		Read the data
//		List<User> findAllUsers = userRepository.findAll();
//		findAllUsers.forEach(userTemp -> {
//			System.out.println(userTemp);
//		});
//		Deleting data
//		userRepository.deleteById(2);

//		Custom Finders
//		Find User By Name
//		List<User> findByNameUser = userRepository.findByName("Jenny Saxena");
//		findByNameUser.forEach(userTemp -> {
//			System.out.println(userTemp);
//		});
//		Find by Name and Location
//		List<User> findByNameAndLocation = userRepository.findByNameAndLocation("Jayan Sharma", "Mumbai");
//		findByNameAndLocation.forEach(userTemp -> {
//			System.out.println(userTemp);
//		});
//		Find Name Starting with a particular pattern
//		List<User> findByNamePattern = userRepository.findByNameStartingWith("d");
//		findByNamePattern.forEach(userTemp -> {
//			System.out.println(userTemp);
//		});

//		@Query Annotation
//		List<User> allUsers = userRepository.getAllUsers();
//		allUsers.forEach(userTemp -> {
//			System.out.println(userTemp);
//		});
//		List<User> findByNameUser2 = userRepository.findByName2("Jenny Saxena");
//		findByNameUser2.forEach(userTemp -> {
//			System.out.println(userTemp);
//		});

//		Native Query
		List<User> allUsers2 = userRepository.getAllUsers2();
		allUsers2.forEach(userTemp -> {
			System.out.println(userTemp);
		});
	}

}
