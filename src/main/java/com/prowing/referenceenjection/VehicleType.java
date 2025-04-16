package com.prowing.referenceenjection;

public class VehicleType {
	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VehicleType [name=" + name + "]";
	}

	public VehicleType(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
