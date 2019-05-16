package Homework23;

import java.nio.charset.MalformedInputException;

/**
 * 2模拟银行取钱的问题 
1.定义一个Account类 
1）该Account类封装了账户编号（String）和余额（double）两个属性 
2）设置相应属性的getter和setter方法 
3）提供无参和有两个参数的构造器 
Deposit, Withdraw 两个线程 
// 再写存钱线程和取钱线程
// 取钱线程不断取钱, 每次取1000以内随机的钱,如果不够,则等待
// 存钱线程也不断存钱,每次存1000以内随机的钱,存完以后,通知取钱线程,并睡眠2秒钟
// 余额不允许出现0或负数. 

 * @author win10
 *
 */
public class homework2 {

	public static void main(String[] args) {
		Deposit d=new Deposit();
		Withdraw w=new Withdraw();
		new Thread(d).start();
		new Thread(w).start();
	}
}
class Account{
	private String code;
	private double balance;
	
	public Account(String code, double balance) {
		super();
		this.code = code;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
class Deposit implements Runnable{

	@Override
	public void run() {
		double deposit=Math.random()*1000+1;
		
	}
	
}
class Withdraw implements Runnable{

	@Override
	public void run() {
		double money;
		if()
		double withdraw=Math.random()*1000+1;
		
	}
	
}