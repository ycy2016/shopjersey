package com.cn.enity;

import java.util.List;

/**
 * 按 bootsrap-tabel 组件要求的格式
 * @author Mathartsys
 *
 */
public class ResulteData {

	private List<ProductOrder> rows; 
	private int total;
	
	
	public List<ProductOrder> getRows() {
		return rows;
	}
	public void setRows(List<ProductOrder> rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}
