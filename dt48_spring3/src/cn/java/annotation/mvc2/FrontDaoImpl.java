package cn.java.annotation.mvc2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("frontDaoImpl")
@Repository
public class FrontDaoImpl {
	public void addUser() {
		System.out.println("Ìí¼Ó³É¹¦");
	}
}
