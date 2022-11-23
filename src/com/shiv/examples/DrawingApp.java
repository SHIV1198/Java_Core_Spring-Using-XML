package com.shiv.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//Shape circle = (Shape) context.getBean("shape"); // <-- shape here is id
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		Triangle t = context.getBean("triangle",Triangle.class); 
		System.out.println(t);
		
		context.registerShutdownHook();
	}

}
