package com.prowing.consinjectAmbigutity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionTest {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prowing/consinjectAmbigutity/additionConsinjectconfig.xml");
	Addition add1=(Addition)ctx.getBean("add");
	add1.dosum();
	
}
}
