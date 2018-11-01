package cn.java.aop2;

import java.net.PasswordAuthentication;

import org.aspectj.lang.ProceedingJoinPoint;

public class Auth {
	private String username = "admin";
	
	private String password = "123";
	
	public void isUserExist(ProceedingJoinPoint pp) throws Throwable {
		if("admin".equals(username) && "123".equals(password)) {
			pp.proceed(); //·ÅÐÐ
		}else {
			System.out.println("Ç×µÇÂ½´íÎó");
		}
	}
}
