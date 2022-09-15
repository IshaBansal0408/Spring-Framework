package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
//	Expressions
	@Value("#{23+34}")
	private int x;
	@Value("#{56>23?45:34}")
	private int y;

//	Static Methods
	@Value("#{T(java.lang.Math).sqrt(625)}")
	private double z;
//	Static Variables
	@Value("#{T(java.lang.Math).E}")
	private double eVal;
//	Creating Objects
	@Value("#{new java.lang.String('Varun')}")
	private String name;

//	Boolean Values
	@Value("#{4<3}")
	private Boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double geteVal() {
		return eVal;
	}

	public void seteVal(double eVal) {
		this.eVal = eVal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", eVal=" + eVal + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
