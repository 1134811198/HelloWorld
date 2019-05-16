package Homework23;

/*
 * 1:模拟一个人生产50个玩具，每200毫秒生产一个，当生产到第20个时加入每秒吃1个馒头，共吃完3个后在接着生产的多线程。
 */
public class TestThread {
	
	public static void main(String[] args) {
		Person person=new Person();
		Productor pro = new Productor(person);
		EatBread eat = new EatBread(person);
		pro.start();
		eat.start();
	}

}
class Productor extends Thread{
	private Person person;
	public Productor(Person person){
		this.person=person;
	}
	@Override
	public void run() {
		//调用person的produce方法
		person.produce();
	}
	
}

class EatBread extends Thread{
	private Person person;
	public EatBread(Person person){
		this.person=person;
	}
	@Override
	public void run() {
		//调用person的eat方法
		person.eat();
	}
	
}

class Person{
	
	boolean flag = true;
	//吃馒头
	public synchronized void eat(){
		if(flag)
			try {
				wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		for(int i=1;i<=3;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"吃了第"+i+"个馒头！");
		}
		notify();
	}
	//生产玩具
	public synchronized void produce(){
		for(int i=1;i<=50;i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"生产了第"+i+"个玩具！");
			if(i==20){
				flag=false;//更新标记
				notify();
				//调用吃馒头
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}			
		}		
	}
}

