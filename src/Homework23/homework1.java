package Homework23;

/*
 * 1:ģ��һ��������50����ߣ�ÿ200��������һ��������������20��ʱ����ÿ���1����ͷ��������3�����ڽ��������Ķ��̡߳�
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
		//����person��produce����
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
		//����person��eat����
		person.eat();
	}
	
}

class Person{
	
	boolean flag = true;
	//����ͷ
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
			System.out.println(Thread.currentThread().getName()+"���˵�"+i+"����ͷ��");
		}
		notify();
	}
	//�������
	public synchronized void produce(){
		for(int i=1;i<=50;i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"�����˵�"+i+"����ߣ�");
			if(i==20){
				flag=false;//���±��
				notify();
				//���ó���ͷ
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}			
		}		
	}
}

