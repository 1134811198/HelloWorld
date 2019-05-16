package Homework22;

import java.util.ArrayList;

/**
 * 三、编写程序，在main方法中创建一个线程。
线程每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，
打印后将该整数放到集合中；
共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出；
在main线程中，唤醒interrupt上述睡眠的线程，使其尽快打印集合内容。
 * @author win10
 *
 */
public class homework3 {

	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		
		t.start();
		for(int j=0;j<100;j++){
		t.interrupt();}
		
		
		
	}

}
class MyThread implements Runnable{
     
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 int i=(int) (Math.random()*100+1);
		System.out.println(i);

		}
//		ArrayList alist=new ArrayList();
//		alist.add(i);
		
	}
	
}