package com.prowing.springcore.lifecyclebean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		AbstractApplicationContext appCtx = new ClassPathXmlApplicationContext(
				"com/prowing/springcore/lifecyclebean/employeelifecyclebean.xml");
		
		Employee employee1 = (Employee) appCtx.getBean("employee");
	    System.out.println(employee1);
		
		/*Department department=(Department)appCtx.getBean("dept");
		System.out.println(department);
		appCtx.registerShutdownHook();
		
		Project project1=(Project)appCtx.getBean("project");
		System.out.println(project1);*/
		
		
	
	}
}
