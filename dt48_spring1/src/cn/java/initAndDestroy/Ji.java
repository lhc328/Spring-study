package cn.java.initAndDestroy;

public class Ji {
	public Ji() {
		System.out.println("鸡出生了");
	}
	
	public void init() {
		System.out.println("ji.我是初始化");
	}
	
	public void behavior() {
		System.out.println("鸡会打鸣");
	}
	
	public void destroy() {
		System.out.println("....ji挂了");
	}
}
