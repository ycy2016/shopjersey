package com.cn.enity;

/**
 * 订单
 * 
 * @author Mathartsys
 *
 */
public class ProductOrder {

	private Integer order_id;// 结算单id
	private Integer prod_code;// 商品编号
	private String prod_desc;// 商品名称
	private Double order_price;// 订单价格
	private String order_date;// 订单 日期
	private Integer order_amount;// 数量
	private String client_name;// 客人的名字
	private String remark;// 备注

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getProd_code() {
		return prod_code;
	}

	public void setProd_code(Integer prod_code) {
		this.prod_code = prod_code;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public Double getOrder_price() {
		return order_price;
	}

	public void setOrder_price(Double order_price) {
		this.order_price = order_price;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public Integer getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(Integer order_amount) {
		this.order_amount = order_amount;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	@Override
	public String toString() {
		return "ProductionOrder [order_id=" + order_id + ", prod_code="
				+ prod_code + ", prod_desc=" + prod_desc + ", order_price="
				+ order_price + ", order_date=" + order_date
				+ ", order_amount=" + order_amount + ", client_name="
				+ client_name + ", remark=" + remark + "]";
	}

	
	
}
