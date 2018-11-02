package cn.java.annotation.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	public static void main(String[] args) {
		//BankServiceProxy bsp = new BankServiceProxy();
		//bsp.chaMoney();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Ji smallJi = (Ji)context.getBean("smallJi");
		smallJi.behavior();
		
	}
}
