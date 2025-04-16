package com.prowing.springcore.standalonecollection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prowing/springcore/standalonecollection/stanaloneconfig.xml");
	Person person1=ctx.getBean("person1",Person.class);
	System.out.println(person1);
	System.out.println(person1.getFriends().getClass().getName());
	System.out.println(person1.getFeeStructure().getClass().getName());
	System.out.println(person1.getdBpro().getClass().getName());
}
}
