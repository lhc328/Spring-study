package cn.java.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	
	
	public static void main(String[] args) {
		//YellowMouseWolf yellow1 = new YellowMouseWolf();
		//1.�������(context����spring����)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��ȡspring�����д����Ķ���,ͨ��idֵ��ȡ
		YellowMouseWolf yellow1 = (YellowMouseWolf)context.getBean("yellow1");
		yellow1.behavior();
	}
	
}
