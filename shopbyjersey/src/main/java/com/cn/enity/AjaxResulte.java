package com.cn.enity;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AjaxResulte {

	private ProductionDetail pd;
	private boolean resulte;
	
	public ProductionDetail getPd() {
		return pd;
	}
	public void setPd(ProductionDetail pd) {
		this.pd = pd;
	}
	public boolean isResulte() {
		return resulte;
	}
	public void setResulte(boolean resulte) {
		this.resulte = resulte;
	}
	
	
}
