package Homework16;

import java.util.Scanner;

/**
 * 2.	获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ ab”在 “abkkcadkabkebfkabkskab”    
      中出现的次数 

 * @author win10
 *
 */
public class Homework2 {
 public static void main(String[]args){
	 Scanner input = new Scanner(System.in);
	 System.out.println("请输入字符串一：");//abcdabc
	 String s1 = input.next();
	 System.out.println("请输入字符串二：");//ab
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
