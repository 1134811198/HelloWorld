
 package day16;
  
/**
 * 输入一个姓名 ，形式为zhang_san_feng，最终转换成 zhangSanFeng 
 * @author win10
 *
 */

public class Test1 {
	  public static void main(String[]args){
		  String name="zhang_san_feng";
		  String n2=name.substring(6,7);
		        String name2=n2.toUpperCase();
		  String n3=name.substring(10,11);
		        String name3=n3.toUpperCase();
		  
		  String n1=name.substring(0,5);
		  String n4=name.substring(7,9);
		  String n5=name.substring(11);
		
		  System.out.println(n1.concat(name2).concat(n4).concat(name3).concat(n5));
		 
		 }
		
	  }
   
   


