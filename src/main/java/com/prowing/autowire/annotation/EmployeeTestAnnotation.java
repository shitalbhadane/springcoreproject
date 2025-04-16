package com.prowing.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTestAnnotation {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prowing/autowire/annotation/autowireannotationconfig.xml");
		Employee employee1=(Employee)ctx.getBean("employee");
		System.out.println(employee1);
	}

}
