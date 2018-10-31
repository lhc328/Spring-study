package cn.java.di5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	
	
	public static void main(String[] args) {
		//YellowMouseWolf yellow1 = new YellowMouseWolf();
		//1.启动框架(context代表spring容器)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.获取spring容器中创建的对象,通过id值获取
		Cat yellow1 = (Cat)context.getBean("cat2");
		System.out.println(yellow1);
	}
	
}
