package Homework16;

import java.util.Scanner;

/**
 * 1.	将一个字符串进行反转。将字符串中指定部分进行反转。
 * 比如将“abcdefg”反转为”abfedcg”
 */
public class Homework1 {
   public static void main(String[]args){
	   Scanner input=new Scanner(System.in);
	   System.out.println("请输入字符串：");
	   String s=input.next();
	   System.out.println("请输入反转的初始位置：");//长度中的第几位
	   int l1=input.nextInt();
	   System.out.println("请输入反转的结束位置：");//长度中的第几位
	   int l2=input.nextInt();
	   StringBuffer sb=new StringBuffer(s); 
		 StringBuffer sb1=sb.reverse();
		 String sb2=sb1.substring(l1-2,l2-1);
		 System.out.println(sb1);//反转后的字符串
		 System.out.println(sb2);//反转后的字符串截取
		 StringBuffer ss=new StringBuffer(s);
		 System.out.println(ss.replace(l1-1,l2,sb2));//
	
	
	   
	   
   }
}
