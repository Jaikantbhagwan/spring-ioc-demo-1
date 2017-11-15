package com.jacktest.maven.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApp2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization)ctx.getBean("myorg");
		
		System.out.println(org);
		
		org.corporateSlogan();
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
