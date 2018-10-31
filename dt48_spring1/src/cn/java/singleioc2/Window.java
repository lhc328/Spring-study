package cn.java.singleioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	
	
	public static void main(String[] args) {
		//YellowMouseWolf yellow1 = new YellowMouseWolf();
		//1.�������(context����spring����)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��ȡspring�����д����Ķ���,ͨ��idֵ��ȡ
		Dog dog1 = (Dog)context.getBean("dog");
		Dog dog2 = (Dog)context.getBean("dog");
		//Dog dog3 = (Dog)context.getBean("dog");
		System.out.println(dog2==dog1);
	}
	
}
