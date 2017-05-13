package com.cn.enity;

import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name ="Client")
public class Client {
	@QueryParam(value="client_id")
	private Integer client_id;
	
	@QueryParam(value="client_name")
	private String client_name;

	public Integer getClient_id() {
		return client_id;
	}

	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	@Override
	public String toString() {
		return "Client [client_id=" + client_id + ", client_name="
				+ client_name + "]";
	}

	
}
