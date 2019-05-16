package day22;

public class Test3 {

	public static void main(String[] args) {
		//MyThread m=new MyThread();
		MyThread2 n=new MyThread2();
		Thread m2=new Thread(n);
		//m.start();
		m2.start();
		for(int i=1;i<=3000;i++){
			System.out.println("JJJJJJJJJJJJJJJJJJJ"+i);
		
	}
	
}}
//class MyThread extends Thread{
//
//	@Override
//	public void run() {
//		
//			for(int i=1;i<=3000;i++){
//				System.out.println("ºì"+i);
//			}
//	}
//	
//}
class MyThread2 implements Runnable{

	@Override
	
		public void run() {
			for(int i=1;i<=3000;i++){
				System.out.println("HHHHHHHHH"+i);
			}
		
	}
	
}
		
	