package com.cn.enity;

public class ProductionDetail {

	String prod_code; //编码
	String prod_desc; //
	String prod_author; // 作者
	String prod_type; // 产品类型
	String prod_country;// 国家
	Double prod_price; // 单价
	String publish_date; // 出版日期
	
	public String getProd_code() {
		return prod_code;
	}
	public void setProd_code(String prod_code) {
		this.prod_code = prod_code;
	}
	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	
	public String getProd_author() {
		return prod_author;
	}
	public void setProd_author(String prod_author) {
		this.prod_author = prod_author;
	}
	public String getProd_type() {
		return prod_type;
	}
	public void setProd_type(String prod_type) {
		this.prod_type = prod_type;
	}
	public String getProd_country() {
		return prod_country;
	}
	public void setProd_country(String prod_country) {
		this.prod_country = prod_country;
	}
	public Double getProd_price() {
		return prod_price;
	}
	public void setProd_price(Double prod_price) {
		this.prod_price = prod_price;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}

}
