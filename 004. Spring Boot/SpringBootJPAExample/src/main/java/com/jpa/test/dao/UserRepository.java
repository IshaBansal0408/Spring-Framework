package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//	Automatically Implementation already present

//	Custom Finders
	public List<User> findByName(String name);

	public List<User> findByNameAndLocation(String name, String location);

	public List<User> findByNameStartingWith(String prefix);

//	Manual Query Writing
	@Query("select u from User u")
	public List<User> getAllUsers();

	@Query("select u from User u WHERE u.name= :n")
	public List<User> findByName2(@Param("n") String name);
	
//	SQL Query
	@Query(value="select * from User",nativeQuery = true)
	public List<User> getAllUsers2();
}
