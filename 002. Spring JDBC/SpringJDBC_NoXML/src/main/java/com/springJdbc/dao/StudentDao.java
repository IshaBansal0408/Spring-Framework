package com.springJdbc.dao;

import java.util.List;

import com.springJdbc.entities.Student;

public interface StudentDao {
	public int insertData(Student student);
	
	public int updateData(Student student);
	
	public void deleteData(int id);
	
	public Student getStudentById(int sId);
	
	public List<Student> getAllStudents();
}
