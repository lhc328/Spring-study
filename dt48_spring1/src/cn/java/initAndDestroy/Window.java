package cn.java.initAndDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	
	
	public static void main(String[] args) {
		//YellowMouseWolf yellow1 = new YellowMouseWolf();
		//1.�������(context����spring����)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��ȡspring�����д����Ķ���,ͨ��idֵ��ȡ
		Ji ji = (Ji)context.getBean("ji");
		ji.behavior();
		//3.�ر�context����,�������������е����ж���
		((ClassPathXmlApplicationContext)context).close();
	}
	
}
