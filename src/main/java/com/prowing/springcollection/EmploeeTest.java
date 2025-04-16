package com.prowing.springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmploeeTest {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prowing/spring/SpringCoreProject/employeecollectionconfig.xml");
	Employee employee1=(Employee)ctx.getBean("employee");
	System.out.println(employee1.getEmpName());
	System.out.println(employee1.getPhones());
	System.out.println(employee1.getEmpAddress());
	System.out.println(employee1.getCourses());
	System.out.println(employee1.getDBPro());
	
}
}
