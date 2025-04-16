package com.prowing.springsetterinjection;

public class Employee {

	private int id;
	private String name;
	private Address address1;

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

	public void destroy() {
		System.out.println("destroy method is called");
	}

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public void address() {

		address1.address();
	}

}
