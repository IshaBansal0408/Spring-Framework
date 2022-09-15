package com.wire.qualify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("sch2")
	private School school;

	public School getSchool() {
		return school;
	}

//	@Autowired
	public void setSchool(School school) {
		this.school = school;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public Student(School school) {
		super();
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}

}
