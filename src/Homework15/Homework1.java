package Homework15;
/**
 * 1、将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
推荐：可以自定义方法实现

 * @author win10
 *
 */
public class Homework1 {

public static void main(String[]args){
	  String s1="abcdefg";
	 int l=s1.length();
   for(int i=l;i>0;i--){
		  System.out.print(s1.substring(i-1,i)); 
	  }
	  
/*	String s2=new String();
	String j1=s1.substring(0,1);
	System.out.println(j1);
	String j2=s1.substring(1,2);
	String j3=s1.substring(2,3);
	String j4=s1.substring(3,4);
	String j5=s1.substring(4,5);
	String j6=s1.substring(5,6);
	String j7=s1.substring(6,7);
	s2=j7+j6+j5+j4+j3+j2+j1;
	System.out.println(s2);
	*/
}
	
}

  


