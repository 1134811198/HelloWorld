package Homework22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 一、Create a program named MyInput.java:
 *  Contain the methods for reading int,读取 double,读取 float,读取 boolean, 读取short,读取 byte and 读取String values from the keyboard
 * @author win10
 *创建名为MyInput.java的程序，包含方法如下：实现从键盘读取int，读取 double,读取 float,读取 boolean, 读取short,读取 byte and 读取String
 */
public class MyInputhomework1 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("请输入：");
	    String s = br.readLine();
	    MyInputhomework1 m=new MyInputhomework1();
	  //m.methodInt(s);
	    m.methodDouble(s);
//	    m.methodFloat(s);
//	    m.methodBoolean(s);
//	    m.methodShort(s);
//	    m.methodByte(s);
//	    m.methodString(s);

	}
	public void methodInt(String s){
		
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
	public void methodDouble(String s){
		double d=Double.parseDouble(s);
		System.out.println(d);
		}
	public void methodFloat(String s){
		float f=Float.parseFloat(s);
	}
	public void methodBoolean(String s){
		boolean b=Boolean.parseBoolean(s);
	}
	public void methodShort(String s){
		short sh=Short.parseShort(s);
	}
	public void methodByte(String s){
		byte by=Byte.parseByte(s);
	}
	public void methodString(String s){
		String ss=s;
	}
}

