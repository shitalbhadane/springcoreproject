package com.prowing.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{111+222}")
	private int x;
	@Value("1")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(12)}")
	private int z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{new java.lang.String('Shital Bhadane')}")
	private String name;
	@Value("#{1>0}")
	public boolean isActive;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

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

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
