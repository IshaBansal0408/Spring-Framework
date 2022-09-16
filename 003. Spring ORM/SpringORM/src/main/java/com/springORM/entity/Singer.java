package com.springORM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Singer_details")
public class Singer {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Singer_ID")
	private int id;
	@Column(name = "Singer_Name")
	private String name;
	@Column(name = "Singer_Location")
	private String loc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Singer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Singer(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Singer [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}

}
