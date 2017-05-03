package com.cn.jerse;

import org.glassfish.jersey.server.ResourceConfig;

import com.cn.jersesimpl.DoWork;
import com.cn.jersesimpl.DoWorkTest;
import com.cn.jersesimpl.RestWebServiceInterceptor;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * jersey注册类
 * @author Mathartsys
 *
 */
public class UserResource extends ResourceConfig {
	 public  UserResource(){
		 	//使用tomcat启动,必须加上这个
		 	register(JacksonJsonProvider.class);
	        register(RestWebServiceInterceptor.class);
	        register(DoWork.class);
//	        register(DoWorkTest.class);
	    }
}