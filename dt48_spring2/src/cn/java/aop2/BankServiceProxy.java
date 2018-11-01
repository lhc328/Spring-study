package cn.java.aop2;

public class BankServiceProxy {
	private BankServiceImpl  bsi = new BankServiceImpl();
	private Security s = new Security();
	private RiZhi rz = new RiZhi();
	private Clean c = new Clean();
	
	public void chaMoney() {
		s.isSecurity();
		bsi.getMoney();
		rz.log();
		c.clearResource();
	}
	
	public void moneyZhuan() {
		s.isSecurity();
		bsi.zhuanMoney();
		rz.log();
		c.clearResource();
	}
	
	public void touzi() {
		s.isSecurity();
		bsi.invest();
		rz.log();
		c.clearResource();
	}
}
