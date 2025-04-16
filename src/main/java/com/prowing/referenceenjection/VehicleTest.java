package com.prowing.referenceenjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prowing/referenceenjection/vehiclereferenceconfiguration.xml");
		Vehicle vehicle=(Vehicle)ctx.getBean("vehicle1");
		System.out.println(vehicle);
		
	}

}
