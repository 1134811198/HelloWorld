package Homework22;

import java.util.ArrayList;

/**
 * ������д������main�����д���һ���̡߳�
�߳�ÿ��һ��ʱ�䣨200ms���ڵ����ʱ�䣩����һ��0-100֮������������
��ӡ�󽫸������ŵ������У�
������100��������ȫ��������˯��30�룬Ȼ�󽫼������ݴ�ӡ�����
��main�߳��У�����interrupt����˯�ߵ��̣߳�ʹ�価���ӡ�������ݡ�
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