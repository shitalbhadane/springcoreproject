package com.prowing.springcollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String empName;
	private List<String> phones;
	private Set<String> empAddress;
	private Map<String, String> courses;
	private Properties DBPro;

	public Employee(String empName, List<String> phones, Set<String> empAddress, Map<String, String> courses,
			Properties dBPro) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.empAddress = empAddress;
		this.courses = courses;
		DBPro = dBPro;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Properties getDBPro() {
		return DBPro;
	}

	public void setDBPro(Properties dBPro) {
		DBPro = dBPro;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
