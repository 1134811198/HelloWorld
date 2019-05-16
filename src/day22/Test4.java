package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) {
		MyThread m1=new MyThread();
		MyThread3 m2=new MyThread3();
	}

}
class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<100;i++){
		System.out.println((int)Math.random()*100+1);}
		
	}
	
}
class MyThread3 implements Runnable{

	@Override
	public void run() {
		System.out.println("ÇëÊäÈë×Ö·û£º");
		BufferedReader br=new BufferedReader
				(new InputStreamReader(System.in));
		
			String  s=new String(br.readLine());
			if(s=="Q"){
				
			}
		
	}
	
}
