package Homework16;

import java.util.Scanner;

/**
 * 2.	��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
      ���磺��ȡ�� ab���� ��abkkcadkabkebfkabkskab��    
      �г��ֵĴ��� 

 * @author win10
 *
 */
public class Homework2 {
 public static void main(String[]args){
	 Scanner input = new Scanner(System.in);
	 System.out.println("�������ַ���һ��");//abcdabc
	 String s1 = input.next();
	 System.out.println("�������ַ�������");//ab
	 String s2 = input.next();
	 int times = 0;
	 int index = s1.indexOf(s2);
	 while(index != -1){
		 s1 = s1.substring(index+1);
		 times++;
		 index = s1.indexOf(s2);
	 }
	 System.out.println(times);
	 
	 
		 }
		 

}
