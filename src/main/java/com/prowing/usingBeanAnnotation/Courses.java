package com.prowing.usingBeanAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages="com.prowing.usingBeanAnnotation")
public class Courses {
	@Override
	public String toString() {
		return "Courses [name=" + name + "]";
	}

	private String name;

	public Courses(String name) {
		super();
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Number os classed");
	}


}
