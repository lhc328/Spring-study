package cn.java.aop2;


//统一异常处理
public class Global {
	public void handExpt(Throwable ex) {
		System.out.println("哎呀出错了");
	}
}
