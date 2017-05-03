package com.cn.enity;

import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name  = "GetPath")
public class GetPath {

@QueryParam(value = "str")
private String str;

public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}


	
}
