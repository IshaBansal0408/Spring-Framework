package com.springJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.entities.Student;

public class StudentDaoClass implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insertData(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int update = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return update;
	}
	
	public int updateData(Student student) {
		String query = "update student set name=?,city=? where id=? ";
		int update = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return update;
	}
	
	public void deleteData(int id) {
		String query = "delete from student where id = ?";
		jdbcTemplate.update(query,id);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



}
