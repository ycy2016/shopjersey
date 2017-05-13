//package com.cn.controller;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.ws.rs.BeanParam;
//import javax.ws.rs.FormParam;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//
//
//
//
//import org.apache.log4j.Logger;
//
//import com.cn.enity.AjaxResulte;
//import com.cn.enity.Client;
//import com.cn.enity.GetPath;
//import com.cn.enity.Pagedesc;
//import com.cn.enity.SearchTool;
//
//@Path("/userTest")
//public class DoWorkTest {
//
//	Logger log =Logger.getLogger(DoWorkTest.class);
//	
////	@Autowired
////	private ServiceImpl Impl;
////
////	/**
////	 * 返回的格式为json,需按照bootsrap-table组件参数要求返回rows和 total
////	 * 
////	 * @param searchTool
////	 * @return
////	 */
////	@Path("getlist")
////	@GET
////	@Produces(MediaType.APPLICATION_JSON)
////	public ResulteData getOrder(@BeanParam SearchTool searchTool) {
////	//	log.info("查询参数:"+searchTool.toString());
////		return Impl.getRD(searchTool);
////	}
////
////	/*
////	 * 获得商品详情
////	 */
////	@Path("getDetail")
////	// 前端传过来的参数
////	@POST
////	@Produces(MediaType.APPLICATION_JSON)
////	public AjaxResulte getDetail(@FormParam("order_id") Integer order_id) {
////	//	log.info("查询明细");
////		ProductionDetail pd = Impl.getSodetaildao(order_id);
////		AjaxResulte ar = new AjaxResulte();
////		ar.setPd(pd);
////		ar.setResulte(true);
////		return ar;
////	}
//
//	//---------------------------------------------
//	
//	
//	@Path("getit")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Map<String,String>> getIt(@BeanParam GetPath getPath) {
//		Map<String,String> map =new HashMap<String, String>();
//		//map.put("like", Impl.getText());	
//	//	System.out.println(Impl.find());
//		log.info("参数"+getPath.toString());
//		List<Map<String,String>>  list =new ArrayList<Map<String,String>>();	
//		list.add(map);
//        return list;
//    }
//	
//	@Path("getclient") //前端传过来的参数
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//	//@Consumes(MediaType.APPLICATION_XML)  
//    public Client getClient( @PathParam("client_id") int client_id, @PathParam("client_name") String client_name) {	
//		System.out.println(client_id+client_name);	
//		client_id =10;
//		 client_name="jack";		
//		Client client= new Client();
//		client.setClient_id(client_id);
//		client.setClient_name(client_name);	
//        return client;
//    }
//	
//	/**
//	 * jersey 如何封装前端请求
//	 * @param page
//	 * @return
//	 */
//	@Path("{limit}/{offset}")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//	//@Consumes(MediaType.APPLICATION_XML)  
//    public String getPage(@BeanParam Pagedesc page) {
//		System.out.println(page.getLimit()+page.getOffset());
//		return "你好";	
//	}
//	
//	@Path("get") //前端传过来的参数
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)  
//    public AjaxResulte searchTest(@BeanParam Pagedesc page,@BeanParam Client client) {
//		Integer limit = page.getLimit();
//		Integer offset = page.getOffset();
//		System.out.println(offset+":"+limit);		
//		AjaxResulte br = new AjaxResulte();
////		List<Client> list = getpage(limit, offset);
////		br.setRows(list);
////		br.setTotal(100);
//		return br;		
//    }
//	
//	
//	public List<Client> getpage(int limit, int offest) {
//		List<Client> list = new ArrayList<Client>();
//		int i = 1;
//		for (; i <= 100; i++) {
//			Client client = new Client();
//			client.setClient_id(i);
//			client.setClient_name("С" + (char) (21568 + i) + (char) (21568 + i));
//			list.add(client);
//		}
//		List<Client> list1 = new ArrayList<Client>();
//		int start = offest;
//		int end = offest + limit;
//		for (Client t : list) {
//			if (t.getClient_id() > start && t.getClient_id() <= end) {
//				list1.add(t);
//			}
//		}
//		return list1;
//	}
//	
//}
