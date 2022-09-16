package com.springJdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springJdbc.entities.Student;

@Component("studentDao")
public class StudentDaoClass implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertData(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int update = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return update;
	}

	public int updateData(Student student) {
		String query = "update student set name=?,city=? where id=? ";
		int update = jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return update;
	}

	public void deleteData(int id) {
		String query = "delete from student where id = ?";
		jdbcTemplate.update(query, id);
	}

	public Student getStudentById(int sId) {
		String query = "Select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperClass();
		Student student = jdbcTemplate.queryForObject(query, rowMapper,sId);
		return student;
	}

	public List<Student> getAllStudents() {
		String query = "Select * from student";
		RowMapper<Student> rowMapper = new RowMapperClass();
		List<Student> allStudents = jdbcTemplate.query(query, rowMapper);
		return allStudents;
	}
	
	
}
