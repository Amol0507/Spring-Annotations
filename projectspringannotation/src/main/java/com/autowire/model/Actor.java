package com.autowire.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	@Autowired
	Movie m;
	
	public void findActor()
	{
		m.findMovie();
		System.out.println("Jacky Shroff");
	}
}
