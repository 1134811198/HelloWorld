package Homework16;

import java.util.Arrays;

/**
 * 4.���ַ������ַ�������Ȼ˳������ 
	��ʾ�� 
	1���ַ�������ַ����顣
	2������������ѡ��ð�ݣ�Arrays.sort();
	3�����������������ַ���

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
