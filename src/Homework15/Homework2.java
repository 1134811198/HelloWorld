package Homework15;

import java.util.Scanner;

/**
 * 2�������û��������롢���䣬�����Ϣ¼����ȷ������ʾע��ɹ������������쳣����
Ҫ��
�û�������Ϊ2��3��4
����ĳ���Ϊ6��Ҫ��ȫ������
�����а���@��.������@��.��ǰ��

 * @author win10
 *
 */
public class Homework2 {
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.print("�������û�����");
	String name = input.next();
	int l1=name.length();

	if(l1==2||l1==3||l1==4){
		System.out.print("�������һλ���룺");
		}else
			System.out.print("�û�����������");
	       String code = input.next();
		   char[] num=code.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("������ڶ�λ����");
		      
		   else
			   System.out.print("�����ʽ��������������");
		   String code1 = input.next();
		   char[] num1=code1.toCharArray();
		   if(Character.isDigit(num1[0]))
			   System.out.print("�������3λ����");
		      
		   else
			   System.out.print("�����ʽ��������������");
		   String code2 = input.next();
		   char[] num2=code2.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("�������4λ����");
		      
		   else
			   System.out.print("�����ʽ��������������");
		   String code3 = input.next();
		   char[] num3=code3.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("�������5λ����");
		      
		   else
			   System.out.print("�����ʽ��������������");
		   String code4 = input.next();
		   char[] num4=code4.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("�������6λ����");
		      
		   else
			   System.out.print("�����ʽ��������������");
		   String code5 = input.next();
		   char[] num5=code5.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("������ȷ");
		      
		   else
			   System.out.print("�����ʽ��������������");
		   
     System.out.print("���������䣺");
	 String email=input.next();
	if(email.indexOf('@')!=-1&&email.indexOf('.')!=-1&&email.indexOf('@')<email.indexOf('.')){
		System.out.print("ע��ɹ�");
	}else
		System.out.print("�����쳣");
	
	
	}}
			
	


