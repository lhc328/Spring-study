package cn.java.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	public static void main(String[] args) {
		//BankServiceProxy bsp = new BankServiceProxy();
		//bsp.chaMoney();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BankServiceImpl b = (BankServiceImpl)context.getBean("bankServiceImpl");
		b.getMoney();
		
	}
}
