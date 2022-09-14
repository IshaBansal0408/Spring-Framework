package com.springcore.conInj;

public class Person {

	private int id;
	private String name;
	private Certi certi;

	public Person(int id, String name, Certi certi) {
		System.out.println("Constructor(id,name) of person is being called");
		this.id = id;
		this.name = name;
		this.certi = certi;
	}
	

	@Override
	public String toString() {
		return this.id + " : " + this.name + " {" + this.certi.name + "}";
	}

}
