package com.springexample;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Drawing {

	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(new File("spring.xml")));
		Triangle ref = (Triangle)factory.getBean("triangle");
		//Triangle triangle = (Triangle)ref;
		ref.draw();

	}
}
