package cn.java.aop2;

public class BankServiceImpl {

	
	public int getMoney() {
		int i=10/0;
		System.out.println("BankServiceImpl....getMoney()....���500");
		return 500;
	}
	
	public String zhuanMoney() {
		System.out.println("BankServiceImpl....zhuanMoney()....ת��100");
		return "����";
	}
	
	public float invest() {
		System.out.println("BankServiceImpl....invert()....Ͷ��100");
		return 3.14F;
	}
	
	public void bbb() {
		System.out.println("bbbbbbbb....");
	}
}
