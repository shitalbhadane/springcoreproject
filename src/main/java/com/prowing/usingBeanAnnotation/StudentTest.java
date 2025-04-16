package com.prowing.usingBeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigClass.class);
		Student student = ctx.getBean("getStudent", Student.class);
		System.out.println(student);
		student.msg();
		

	}
}
