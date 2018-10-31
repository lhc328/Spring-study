package cn.java.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	
	
	public static void main(String[] args) {
		//YellowMouseWolf yellow1 = new YellowMouseWolf();
		//1.启动框架(context代表spring容器)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.获取spring容器中创建的对象,通过id值获取
		YellowMouseWolf yellow1 = (YellowMouseWolf)context.getBean("yellow1");
		yellow1.behavior();
	}
	
}
