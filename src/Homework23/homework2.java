package Homework23;

import java.nio.charset.MalformedInputException;

/**
 * 2ģ������ȡǮ������ 
1.����һ��Account�� 
1����Account���װ���˻���ţ�String������double���������� 
2��������Ӧ���Ե�getter��setter���� 
3���ṩ�޲κ������������Ĺ����� 
Deposit, Withdraw �����߳� 
// ��д��Ǯ�̺߳�ȡǮ�߳�
// ȡǮ�̲߳���ȡǮ, ÿ��ȡ1000���������Ǯ,�������,��ȴ�
// ��Ǯ�߳�Ҳ���ϴ�Ǯ,ÿ�δ�1000���������Ǯ,�����Ժ�,֪ͨȡǮ�߳�,��˯��2����
// ���������0����. 

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