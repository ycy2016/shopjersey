package com.cn.enity;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name  = "page")
public class Pagedesc {
		//@FormParam("limit")
		@FormParam(value="limit")
		private Integer limit;
		//@FormParam("offset")
		@FormParam(value="offset")
		private Integer offset;
		
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
}
