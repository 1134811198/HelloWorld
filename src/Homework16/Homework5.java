package Homework16;

import java.util.Scanner;

/**
 * 5���Լ����һ��������ʵ���ж��ַ����Ƿ�Ϊnull����ַ���������Ƿ���true�����򷵻�false
 * @author win10
 *
 */
public class Homework5 { 
	public static boolean strEmpty(String str){
	if(str.length()==0){
		return true;
	}else{
		return false;}
	}  
	
		
	
  public static void main(String[] args) {
	    String s="";
	    boolean b=Homework5.strEmpty(s);
	 System.out.println(b);
	
  }	
  
}

