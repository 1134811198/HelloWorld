package Homework15;

import java.util.Scanner;

/**
 * 2、输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
要求：
用户名长度为2或3或4
密码的长度为6，要求全是数字
邮箱中包含@和.，并且@在.的前面

 * @author win10
 *
 */
public class Homework2 {
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入用户名：");
	String name = input.next();
	int l1=name.length();

	if(l1==2||l1==3||l1==4){
		System.out.print("请输入第一位密码：");
		}else
			System.out.print("用户名输入有误");
	       String code = input.next();
		   char[] num=code.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("请输入第二位密码");
		      
		   else
			   System.out.print("密码格式错误，请重新输入");
		   String code1 = input.next();
		   char[] num1=code1.toCharArray();
		   if(Character.isDigit(num1[0]))
			   System.out.print("请输入第3位密码");
		      
		   else
			   System.out.print("密码格式错误，请重新输入");
		   String code2 = input.next();
		   char[] num2=code2.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("请输入第4位密码");
		      
		   else
			   System.out.print("密码格式错误，请重新输入");
		   String code3 = input.next();
		   char[] num3=code3.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("请输入第5位密码");
		      
		   else
			   System.out.print("密码格式错误，请重新输入");
		   String code4 = input.next();
		   char[] num4=code4.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("请输入第6位密码");
		      
		   else
			   System.out.print("密码格式错误，请重新输入");
		   String code5 = input.next();
		   char[] num5=code5.toCharArray();
		   if(Character.isDigit(num[0]))
			   System.out.print("密码正确");
		      
		   else
			   System.out.print("密码格式错误，请重新输入");
		   
     System.out.print("请输入邮箱：");
	 String email=input.next();
	if(email.indexOf('@')!=-1&&email.indexOf('.')!=-1&&email.indexOf('@')<email.indexOf('.')){
		System.out.print("注册成功");
	}else
		System.out.print("输入异常");
	
	
	}}
			
	


