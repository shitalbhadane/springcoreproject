package com.prowing.javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBaseConfig.class);
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println(student1);
		student1.msg();

	}

}
