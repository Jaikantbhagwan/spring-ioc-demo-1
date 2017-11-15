package com.jacktest.maven.springiocdemo;

import com.jacktest.maven.springiocdemo.domain.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISetterApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization)ctx.getBean("myorg");
		
		System.out.println(org);
		
		System.out.println(org.corporateSlogan());
		
		System.out.println(org.corporateService());
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
