package com.wire.xml;

public class Student {
	private School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(School school) {
		super();
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}

}
