package Homework16;

import java.util.Arrays;

/**
 * 4.对字符串中字符进行自然顺序排序。 
	提示： 
	1）字符串变成字符数组。
	2）对数组排序，选择，冒泡，Arrays.sort();
	3）将排序后的数组变成字符串

 * @author win10
 *
 */
public class homework4 {
  public static void main(String[] args) {
	  String s ="knksjdhfu45";
	  char[] charArray = s.toCharArray();
	  Arrays.sort(charArray);
	  System.out.println(Arrays.toString(charArray));
	  String str=new String(charArray);
	  System.out.println(str);
	  
}
}
