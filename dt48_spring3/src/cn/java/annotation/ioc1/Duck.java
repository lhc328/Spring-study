package cn.java.annotation.ioc1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ya")
@Scope("singleton")

public class Duck {
	private String duckName="Ã∆¿œ—º";
	
	private Integer age=20;

	public String getDuckName() {
		return duckName;
	}

	public void setDuckName(String duckName) {
		this.duckName = duckName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
