package com.cn.dao;

import java.util.List;

import com.cn.enity.ProductOrder;
import com.cn.enity.SearchTool;
/**
 * mapper接口
 * @author Mathartsys
 *
 */
public interface SearchOrderDAO {
	public List<ProductOrder> getOrder(SearchTool tool);
	public Integer  getPage(SearchTool tool);

}
