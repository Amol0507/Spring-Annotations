package com.symbiosis.projectspringannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configer.AppConfig;
import com.model.Samsung;

public class TestAnnotation {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
   
		Samsung s=context.getBean(Samsung.class);
		s.config();
	}

}
