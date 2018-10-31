package cn.java.singleioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	
	
	public static void main(String[] args) {
		//YellowMouseWolf yellow1 = new YellowMouseWolf();
		//1.启动框架(context代表spring容器)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.获取spring容器中创建的对象,通过id值获取
		Dog dog1 = (Dog)context.getBean("dog");
		Dog dog2 = (Dog)context.getBean("dog");
		//Dog dog3 = (Dog)context.getBean("dog");
		System.out.println(dog2==dog1);
	}
	
}
