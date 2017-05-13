package com.cn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.junit.experimental.theories.FromDataPoints;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.cn.enity.Client;

@Component
@Path("/usertest")
public class Rest {

	@Path("/git")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getUser() {
		return "get it";
	}

	/**
	 * 表单信息分开传
	 * @param client_name
	 * @param client_id
	 * @return
	 */
	@Path("/client1")
	@GET
    @Consumes(MediaType.APPLICATION_JSON)  
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getClient( @QueryParam("client_name") String  client_name, @QueryParam("client_id") String client_id) {
		List<String> like =new ArrayList<String>();
		like.add("like");
		return like;
	}
	
	@Path("/client")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getClientBean(@Context HttpServletRequest hst) {
		
	String name =	hst.getParameter("client_name");
		
		List<String> like =new ArrayList<String>();
		like.add(name);
		return like;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Integer.valueOf(""));
		
	}
}
