package test;

import jyp.model.TbUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jyp.service.UserServiceI;
import org.springframework.test.annotation.Rollback;

public class TestHibernate {
	@Test
	public void testReg() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "classpath:spring.xml", "classpath:spring-hibernate.xml"});
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		TbUser user = new TbUser();
		user.setUsername("reg");
		user.setPassword("123456");

		if(userService.register(user)!= null)
			System.out.print(user.toString());
		else
			System.out.print("laji!");
	}

}
