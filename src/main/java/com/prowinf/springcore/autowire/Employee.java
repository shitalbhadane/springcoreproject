package com.prowinf.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting  a value ");
	}

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Employee() {
		super();
		System.out.println("default  employee constructor called");
	}

	public void init() {
		System.out.println("init method :employee");
	}

	@Autowired
	public Employee(Address address) {
		super();

		this.address = address;
	}

	public void destroy() {
		System.out.println("destroy method is called");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
