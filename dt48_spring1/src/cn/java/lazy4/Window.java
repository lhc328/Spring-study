package cn.java.lazy4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	
	
	public static void main(String[] args) {
		//YellowMouseWolf yellow1 = new YellowMouseWolf();
		//1.�������(context����spring����)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��ȡspring�����д����Ķ���,ͨ��idֵ��ȡ
		//Duck duck1 = (Duck)context.getBean("duck");
		//duck1.behavior();
	}
	
}
