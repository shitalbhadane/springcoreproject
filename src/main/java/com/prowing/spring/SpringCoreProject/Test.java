package com.prowing.spring.SpringCoreProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/prowing/spring/SpringCoreProject/employeecollectionconfig.xml");
		Student student1 = (Student) ctx.getBean("student");
		System.out.println(student1);

	}

}
