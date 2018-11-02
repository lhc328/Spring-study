package cn.java.annotation.ioc1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="smallJi") //类似于在xml配置bean
@Scope(value="prototype")  //scope 单例singleton多例
public class Ji {
	//@Resource(name="ya")
	@Autowired
	private Duck duck;
	
	public void behavior() {
		System.out.println("打鸣"+duck.getAge());
	}
}
