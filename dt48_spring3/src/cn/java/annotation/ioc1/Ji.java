package cn.java.annotation.ioc1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="smallJi") //��������xml����bean
@Scope(value="prototype")  //scope ����singleton����
public class Ji {
	//@Resource(name="ya")
	@Autowired
	private Duck duck;
	
	public void behavior() {
		System.out.println("����"+duck.getAge());
	}
}
