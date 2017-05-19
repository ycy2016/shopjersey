package com.y;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountByOut {
	
	private static ApplicationContext ctx = null;
	
	@Before
	public void load(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}

	@Test
	public void test(){
		
	}
	

}
