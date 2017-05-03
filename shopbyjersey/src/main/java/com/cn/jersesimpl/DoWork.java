package com.cn.jersesimpl;


import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;

import com.cn.enity.AjaxResulte;
import com.cn.enity.ProductionDetail;
import com.cn.enity.ResulteData;
import com.cn.enity.SearchTool;
import com.cn.service.ServiceImpl;
//@Component
//@Scope("request")
//eclipse撒谎能够的跟新
@Path("/user")
public class DoWork {

//	Logger.get
	
	@Autowired
	private ServiceImpl Impl;

	private Logger log = Logger.getLogger(DoWork.class);
	
	/**
	 * 返回的格式为json,需按照bootsrap-table组件参数要求返回rows和 total
	 * 
	 * @param searchTool
	 * @return
	 */
	@Path("getlist")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResulteData getOrder(@BeanParam SearchTool searchTool) {
		log.info("参数"+searchTool.toString());
		return Impl.getRD(searchTool);
	}

	/*
	 * 获得商品详情
	 */
	@Path("getDetail")
	// 前端传过来的参数
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public AjaxResulte getDetail(@QueryParam("order_id") Integer order_id) {
		log.info("详情"+order_id);
		ProductionDetail pd = Impl.getSodetaildao(order_id);
		AjaxResulte ar = new AjaxResulte();
		ar.setPd(pd);
		ar.setResulte(true);
		return ar;
	}

}
