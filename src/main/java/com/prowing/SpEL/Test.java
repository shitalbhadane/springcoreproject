package com.prowing.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prowing/SpEL/springexpressionlanguages.xml");
	Demo demo=ctx.getBean("demo",Demo.class);
	System.out.println(demo);
}
}
