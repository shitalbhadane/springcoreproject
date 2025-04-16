package com.prowing.springsetterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpolyeeTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/prowing/springsetterinjection/springsetterinjection.xml");
		Employee employee = ctx.getBean("employee", Employee.class);
		employee.address();

	}

}
