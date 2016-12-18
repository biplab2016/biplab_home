package com.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Drawing {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle ref = (Triangle)context.getBean("triangle");
		//Triangle triangle = (Triangle)ref;
		ref.draw();
		
		
	}
}
