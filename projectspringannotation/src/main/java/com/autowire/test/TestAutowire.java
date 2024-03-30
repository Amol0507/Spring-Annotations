package com.autowire.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.autowire.model.Actor;

public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

		context.scan("com.autowire.model");
		context.refresh();
		
		Actor a= context.getBean(Actor.class);
		a.findActor();

	}

}
