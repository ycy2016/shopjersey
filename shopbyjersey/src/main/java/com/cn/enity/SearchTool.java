package com.cn.enity;

import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 查询时封装的实体类
 * 
 * @author Mathartsys
 *
 */
@XmlRootElement(name  = "SearchTool")
public class SearchTool {

	@QueryParam(value = "limit")
	private Integer limit;
	@QueryParam(value = "offset")
	private Integer offset;
	
	@QueryParam(value = "prod_code")
	private Integer prod_code;// 商品编码
	
	@QueryParam(value = "prod_desc")
	private String prod_desc;// 商品名
	
	@QueryParam(value = "order_price_up")
	private Double order_price_up;// 总价价格区间(上)
	@QueryParam(value = "order_price_down")
	private Double order_price_down;// 总价价格区间(下)
	
	@QueryParam(value = "date_start")
	private String date_start;// 开始时间
	@QueryParam(value = "date_end")
	private String date_end;// 结束时间
	
	public Integer  getProd_code() {
		return prod_code;
	}

	public void setProd_code(Integer prod_code) {
		this.prod_code = prod_code;
	}

	public Double getOrder_price_up() {
		return order_price_up;
	}

	public void setOrder_price_up(Double order_price_up) {
		this.order_price_up = order_price_up;
	}

	public Double getOrder_price_down() {
		return order_price_down;
	}

	public void setOrder_price_down(Double order_price_down) {
		this.order_price_down = order_price_down;
	}

	public Double getOrder_price_end() {
		return order_price_up;
	}

	public void setOrder_price_end(Double order_price_up) {
		this.order_price_up = order_price_up;
	}

	public Double getOrder_price_start() {
		return order_price_down;
	}

	public void order_price_down(Double order_price_down) {
		this.order_price_down = order_price_down;
	}
	
	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}


	public String getDate_start() {
		return date_start;
	}

	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}

	public String getDate_end() {
		return date_end;
	}

	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}

	@Override
	public String toString() {
		return "SearchTool [limit=" + limit + ", offset=" + offset
				+ ", prod_code=" + prod_code + ", prod_desc=" + prod_desc
				+ ", order_price_up=" + order_price_up + ", order_price_down="
				+ order_price_down + ", date_start=" + date_start
				+ ", date_end=" + date_end + "]";
	}

	
	
}
