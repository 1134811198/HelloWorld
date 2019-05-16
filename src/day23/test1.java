package day23;

public class test1 {

	public static void main(String[] args) {
		Account a=new Account();
		new Thread(a).start();
		
		new Thread(a).start();
	}

}
class Account implements Runnable{
    double balance=10000;
   
	@Override
	public void run() {
		while(true){
		synchronized(this){
		if(balance<=0){
			System.out.println("账户余额不足");
			break;
		}else{
			balance=balance-1000;
			System.out.println("已经取款1000元"+","+"账户余额是："+balance);
		}
	}}}
	
}
