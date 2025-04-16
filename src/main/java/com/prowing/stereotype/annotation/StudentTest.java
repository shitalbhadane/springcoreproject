package com.prowing.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
public static void main(String[] args) {
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prowing/stereotype/annotation/stereotypeannotation.xml");
		Student student=ctx.getBean("s",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress()) ;
		System.out.println(student.getAddress().getClass().getName());
		
	}
}
}
