package Homework15;

import java.util.Scanner;

/**
 * 3����дjava����������ʽΪ�� First Middle Last��������
 * ��Last,First .M����ʽ��ӡ����������.M���м䵥�ʵ�����ĸ��
 * �������롰Willian Jefferson Clinton���������ʽΪ��Clinton, Willian .J

��ʾ��
���ַ���ת���ɴ�д��toUpperCase
���ַ���ת����Сд��toLowerCase

 * @author win10
 *
 */
public class Homework3 {
   public static void main(String[]args){
	   Scanner input=new Scanner(System.in);
	   System.out.print("������������һ���֣�");
	  
	   String First= input.next();
	   
	   System.out.print("�����������ڶ����֣�");
	   
	   String Middle= input.next();
	   
	   System.out.print("�����������������֣�");
	   
	   String Last= input.next();
	   
	   String M=Middle.toUpperCase();
	   String M1= M.substring(0,1);
	   System.out.print(Last+","+First+"\t"+"."+M1);
   }
}
