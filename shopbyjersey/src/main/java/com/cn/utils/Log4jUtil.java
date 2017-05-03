package com.cn.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jUtil {

	private static Logger log = Logger.getLogger(Log4jUtil.class);

	
	
	
	public static void main(String[] args) {
		
//	PropertyConfigurator.configure( "log4j.properties" ); 
		
//	PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));

	
	log.info("查询参数");
	
	}
	
}
