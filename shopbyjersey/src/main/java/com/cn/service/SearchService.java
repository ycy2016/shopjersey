package com.cn.service;

import com.cn.enity.ProductionDetail;
import com.cn.enity.ResulteData;
import com.cn.enity.SearchTool;

public interface SearchService {

	public ResulteData getRD(SearchTool searchTool);
	
	public ProductionDetail getSodetaildao(Integer order_id) ;
}
