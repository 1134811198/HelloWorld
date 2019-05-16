package Homework15;

import java.util.Scanner;

/**
 * 3、编写java程序，输入形式为： First Middle Last的人名，
 * 以Last,First .M的形式打印出来。其中.M是中间单词的首字母。
 * 例如输入“Willian Jefferson Clinton”，输出形式为：Clinton, Willian .J

提示：
将字符串转换成大写：toUpperCase
将字符串转换成小写：toLowerCase

 * @author win10
 *
 */
public class Homework3 {
   public static void main(String[]args){
	   Scanner input=new Scanner(System.in);
	   System.out.print("请输入姓名第一个字：");
	  
	   String First= input.next();
	   
	   System.out.print("请输入姓名第二个字：");
	   
	   String Middle= input.next();
	   
	   System.out.print("请输入姓名第三个字：");
	   
	   String Last= input.next();
	   
	   String M=Middle.toUpperCase();
	   String M1= M.substring(0,1);
	   System.out.print(Last+","+First+"\t"+"."+M1);
   }
}
