package com.example.springdemos;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		GenericXmlApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		Student stu = container.getBean("stu", Student.class);
		System.out.println(stu);
	}

}
