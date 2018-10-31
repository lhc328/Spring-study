package cn.java.lazy4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	
	
	public static void main(String[] args) {
		//YellowMouseWolf yellow1 = new YellowMouseWolf();
		//1.启动框架(context代表spring容器)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.获取spring容器中创建的对象,通过id值获取
		//Duck duck1 = (Duck)context.getBean("duck");
		//duck1.behavior();
	}
	
}
