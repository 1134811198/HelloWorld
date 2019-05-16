package Homework16;

import java.util.Scanner;

/**
 * 5、自己设计一个方法，实现判断字符串是否为null或空字符串，如果是返回true，否则返回false
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

