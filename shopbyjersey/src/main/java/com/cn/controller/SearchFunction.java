package com.cn.controller;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.cn.enity.AjaxResulte;
import com.cn.enity.ProductionDetail;
import com.cn.enity.ResulteData;
import com.cn.enity.SearchTool;
import com.cn.service.SearchService;
import com.cn.service.impl.SearchServiceImpl;

@Component	
@Path("/user")
public class SearchFunction {
	
	@Autowired
	private SearchService searchServiceImpl;
	private Logger log = Logger.getLogger(SearchFunction.class);
	
	/**
	 * 返回的格式为json,需按照bootsrap-table组件参数要求返回rows和 total
	 * 
	 * @param searchTool
	 * @return
	 */
	@Path("getlist")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResulteData getOrder(@Context HttpServletRequest hsr) {
		SearchTool searchTool =new SearchTool();
		getSearchParam(hsr, searchTool);
		log.info("参数"+searchTool.toString());
		return searchServiceImpl.getRD(searchTool);
	}

	/*
	 * 获得商品详情
	 */
	@Path("getDetail")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public AjaxResulte getDetail(@QueryParam("order_id") Integer order_id) {
		log.info("详情"+order_id);
		ProductionDetail pd = searchServiceImpl.getSodetaildao(order_id);
		AjaxResulte ar = new AjaxResulte();
		ar.setPd(pd);
		ar.setResulte(true);
		return ar;
	}

	/**
	 * 封装参数
	 * @param hsr
	 * @param searchTool
	 */
	private void getSearchParam(HttpServletRequest hsr, SearchTool searchTool) {
		searchTool.setLimit(Integer.valueOf( hsr.getParameter("limit")));
		searchTool.setOffset(Integer.valueOf(hsr.getParameter("offset")));
		if(hsr.getParameter("prod_code")!=null&&!"".equals(hsr.getParameter("prod_code")))searchTool.setProd_code(Integer.valueOf(hsr.getParameter("prod_code")));
		searchTool.setDate_start(hsr.getParameter("date_start"));
		searchTool.setDate_end(hsr.getParameter("date_end"));
	}
	
}
