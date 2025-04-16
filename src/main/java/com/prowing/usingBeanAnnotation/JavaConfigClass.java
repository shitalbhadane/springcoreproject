package com.prowing.usingBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigClass {
	@Bean 
	public Courses getCourses()
	{
		Courses courses=new Courses("its done");
		return courses;
	}

	@Bean
	public Student getStudent() {
		Student student = new Student(getCourses());
		return student;
	}

}
