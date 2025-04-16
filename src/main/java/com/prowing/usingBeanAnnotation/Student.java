package com.prowing.usingBeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Student {
	
	private Courses courses;

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [courses=" + courses + "]";
	}
	public Student(Courses courses) {
		super();
		this.courses = courses;
	}

	public void msg() {
		courses.display();
		System.out.println("Hello Everyone");
	}
}
