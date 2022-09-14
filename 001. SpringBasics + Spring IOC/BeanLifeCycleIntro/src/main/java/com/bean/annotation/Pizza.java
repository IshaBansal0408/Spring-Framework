package com.bean.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + "]";
	}
	
	@PostConstruct 
	public void start() {
		System.out.println("Preparing Pizza!");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Pizza eaten!");
	}

}
