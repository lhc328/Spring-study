package cn.java.aop2;

public class BankServiceImpl {

	
	public int getMoney() {
		int i=10/0;
		System.out.println("BankServiceImpl....getMoney()....Óà¶î500");
		return 500;
	}
	
	public String zhuanMoney() {
		System.out.println("BankServiceImpl....zhuanMoney()....×ªÕË100");
		return "¹þ¹þ";
	}
	
	public float invest() {
		System.out.println("BankServiceImpl....invert()....Í¶×Ê100");
		return 3.14F;
	}
	
	public void bbb() {
		System.out.println("bbbbbbbb....");
	}
}
