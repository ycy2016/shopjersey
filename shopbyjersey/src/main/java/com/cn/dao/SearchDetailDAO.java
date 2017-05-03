package com.cn.dao;

import com.cn.enity.ProductionDetail;

/**
 * mapper接口
 * @author Mathartsys
 *
 */
public interface SearchDetailDAO {

	//结算单详情
	public ProductionDetail getDetail(Integer order_id);
	
}
