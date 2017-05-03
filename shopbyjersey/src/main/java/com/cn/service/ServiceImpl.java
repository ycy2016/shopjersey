package com.cn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.dao.SearchDAO;
import com.cn.dao.SearchDetailDAO;
import com.cn.dao.SearchOrderDAO;
import com.cn.enity.ProductOrder;
import com.cn.enity.ProductionDetail;
import com.cn.enity.ResulteData;
import com.cn.enity.SearchTool;

/**
 * 
 * @author Mathartsys
 *
 */
@Service
public class ServiceImpl {

	@Autowired
	private SearchDAO sdao;
	@Autowired
	private SearchOrderDAO sodao;
	@Autowired
	private SearchDetailDAO searchdetaildao;

	/*
	 * 根据bootsrap_table需要的json参数封装ResulteData
	 */
	public ResulteData getRD(SearchTool searchTool) {
		List<ProductOrder> list = this.getSodao().getOrder(searchTool);
		Integer total = this.getSodao().getPage(searchTool);
		ResulteData br = new ResulteData();
		br.setRows(list);
		br.setTotal(total);
		return br;
	}
	
	public ProductionDetail getSodetaildao(Integer order_id) {
		ProductionDetail pd = searchdetaildao.getDetail(order_id);
		return pd;
	}

	public SearchOrderDAO getSodao() {
		return sodao;
	}

	public void setSodao(SearchOrderDAO sodao) {
		this.sodao = sodao;
	}

	public SearchDAO getSdao() {
		return sdao;
	}

	public void setSdao(SearchDAO sdao) {
		this.sdao = sdao;
	}
	
}
