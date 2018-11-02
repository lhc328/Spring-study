package cn.java.annotation.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("frontServlet")
public class FrontServlet {
	@Autowired
	private FrontServiceImpl fsi;
	
	public void doGet() {
		fsi.add();
	}
	
	public void doPost() {
		doGet();
	}
}
