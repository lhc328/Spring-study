package cn.java.annotation.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("frontServiceImpl")
@Service
public class FrontServiceImpl {
	@Autowired
	private FrontDaoImpl fdi;
	
	public void add() {
		fdi.addUser();
	}
}
