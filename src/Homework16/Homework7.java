package Homework16;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7���Լ����һ��������ģ��String���compareTo�����ڱȽ������ַ����Ĵ�С
 * @author win10
 *
 */
public class Homework7 {
  public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	System.out.println("�������ַ���һ��");
	String s1=input.next();
	System.out.println("�������ַ�������");
	String s2=input.next();
	
	System.out.println(Homework7.compareTo(s1, s2));
	
}
  public static int compareTo(String str1,String str2){
	  if(str1.length()>str2.length())
		  return 1;
	  else if(str1.length()<str2.length())
		  return -1;
	    else {
	      char [] ch2=str2.toCharArray();
	      char [] ch1=str1.toCharArray();
	      for(int i=0;i<ch1.length;i++){
	      if(ch1[i]>ch2[i])
	    	  return 1;
	      else if(ch1[i]<ch2[i])
	    	  return -1;
	      
	    	  }return 0;
	    	  }
	      
		 
	    
  }
}
