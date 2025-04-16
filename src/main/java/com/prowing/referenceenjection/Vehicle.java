package com.prowing.referenceenjection;

public class Vehicle {
	private int engineNo;
	private VehicleType bus;
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public VehicleType getBus() {
		return bus;
	}
	public Vehicle(int engineNo, VehicleType bus) {
		super();
		this.engineNo = engineNo;
		this.bus = bus;
	}
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBus(VehicleType bus) {
		this.bus = bus;
	}
	@Override
	public String toString() {
		return "Vehicle [engineNo=" + engineNo + ", bus=" + bus + "]";
	}


}
