package cn.java.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Window {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person)context.getBean("person");
		System.out.println(person);
	}
}
