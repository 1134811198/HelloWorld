package Homework16;

import java.util.Scanner;

/**
 * 1.	��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��
 * ���罫��abcdefg����תΪ��abfedcg��
 */
public class Homework1 {
   public static void main(String[]args){
	   Scanner input=new Scanner(System.in);
	   System.out.println("�������ַ�����");
	   String s=input.next();
	   System.out.println("�����뷴ת�ĳ�ʼλ�ã�");//�����еĵڼ�λ
	   int l1=input.nextInt();
	   System.out.println("�����뷴ת�Ľ���λ�ã�");//�����еĵڼ�λ
	   int l2=input.nextInt();
	   StringBuffer sb=new StringBuffer(s); 
		 StringBuffer sb1=sb.reverse();
		 String sb2=sb1.substring(l1-2,l2-1);
		 System.out.println(sb1);//��ת����ַ���
		 System.out.println(sb2);//��ת����ַ�����ȡ
		 StringBuffer ss=new StringBuffer(s);
		 System.out.println(ss.replace(l1-1,l2,sb2));//
	
	
	   
	   
   }
}
