package day15;

import java.util.Scanner;

public class Test1 {
  public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	     int i = .nextInt();
	  System.out.println("���������䣺");
	  String s1=new String();
	 int index1=s1.indexOf("@");
	 int index2=s1.indexOf(".");
	 if(index1==-1)
		 System.out.println("����������");
	 else if(index2==-1)
		 System.out.println("����������");
	 else if(index1<index2)
		 System.out.println("����������");
	 else
		 System.out.println(s1);
	  
  }
}
