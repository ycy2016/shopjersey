package snippet;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Snippet {
	ApplicationContext ac;
	
	@Before
	public void set() {
		ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
				//ac = new ClassPathXmlApplicationContext(new String[] {"spring-mvc.xml", "spring-mybatis.xml"});
		System.out.println(ac);

	}
	
	
	@Test
	public void ge(){
		
//		SearchFunction dw=ac.getBean("doWork",SearchFunction.class);
//		//AjaxResulte dl=ac.getBean("bootRes",AjaxResulte.class);
//		
//	System.out.println(dw);
	}
	
	
	}
		
		