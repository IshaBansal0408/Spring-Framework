package com.noBean.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("2")
	private int rNo;
	@Value("tarun")
	private String name;
	@Value("#{matesList}")
	private List<String> mates;

	public int getrNo() {
		return rNo;
	}

	public void setrNo(int rNo) {
		this.rNo = rNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMates() {
		return mates;
	}

	public void setMates(List<String> mates) {
		this.mates = mates;
	}

	@Override
	public String toString() {
		return "Student [rNo=" + rNo + ", name=" + name + ", mates=" + mates + "]";
	}

}
