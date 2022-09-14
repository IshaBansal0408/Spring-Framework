package com.springcore;

// Student Bean
public class Student {

//	Create attributes of Student
	private int studentId;
	private String studentName;
	private String studentAddress;

//	Get Setters and Getters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("ID setter of Student Bean called.");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Name setter of Student Bean called.");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Address setter of Student Bean called.");
		this.studentAddress = studentAddress;
	}

//	Default Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	Parameterized Constructor
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

//	toString Method - Whenever we try to print the object directly this is the placeholder text we get instead of object address
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
