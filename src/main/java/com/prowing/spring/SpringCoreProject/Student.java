package com.prowing.spring.SpringCoreProject;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int id;
	String name;
	@Autowired
	Address address;
	Properties dbPro;

	public Properties getDbPro() {
		return dbPro;
	}

	public void setDbPro(Properties dbPro) {
		this.dbPro = dbPro;
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", dbPro=" + dbPro + "]";
	}

}
