package com.springJdbc.dao;

import com.springJdbc.entities.Student;

public interface StudentDao {
	public int insertData(Student student);
	
	public int updateData(Student student);
	
	public void deleteData(int id);
}
