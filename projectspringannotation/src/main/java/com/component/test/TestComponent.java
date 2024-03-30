package com.component.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.component.model.Laptop;

public class TestComponent {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

		context.scan("com.component.model");
		context.refresh();
		
		Laptop l= context.getBean(Laptop.class);
		l.findInfo();
		}

}
