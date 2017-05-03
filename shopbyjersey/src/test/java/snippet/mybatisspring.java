package snippet;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.dao.SearchDetailDAO;
import com.cn.enity.ProductionDetail;

public class mybatisspring {

	ApplicationContext ac;

	@Before
	public void set() {
		ac = new ClassPathXmlApplicationContext(new String[] {
				"applicationcontext.xml", "spring-mybatis.xml" });
		System.out.println(ac);
	}

	/**
	 *  测试  mapper自动扫描
	 */
	@Test
	public void test1(){
		
//		SearchDAO searchdao = ac.getBean("searchDAO",SearchDAO.class);
//		Client client =	searchdao.findClient();
//		System.out.println(client);
//			
	}
	
	/**
	 *  测试  mapper自动扫描
	 */
	@Test
	public void test2(){
//		ServiceImpl searchdao = ac.getBean("serviceImpl",ServiceImpl.class);
//		Client client =	searchdao.find();
//		System.out.println(client);	
		
	}
	
	/**
	 * 1/测试实体类属性与字段转换
	 * 2/
	 */
	@Test
	public void test3(){
//		 SearchOrderDAO searchdao =
//		 ac.getBean("searchOrderDAO",SearchOrderDAO.class);
//		 
//		 SearchTool st=new SearchTool();
//		 st.setLimit(10);
//		 st.setOffset(0);
//		 st.setProd_desc("h");
//		 
//		 st.setDate_start("2017-3-24");
//		 st.setDate_end("2017-4-24");
//		 
//		 List<ProductOrder> prp = searchdao.getOrder(st);
//		
//		 for(ProductOrder p : prp) {
//			 System.out.println(p);
//		 }
		
		SearchDetailDAO searchdao = ac.getBean("searchDetailDAO",SearchDetailDAO.class);
		ProductionDetail pro =	searchdao.getDetail(10046);
		System.out.println(pro);
		
		 
	}
		
 
	
}
