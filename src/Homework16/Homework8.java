package Homework16;

import java.util.Arrays;

/**
 * 8���������������һ���������飬��������10��Ԫ�أ�ÿ��Ԫ�ص�ֵ����0-9֮�䣬��ӡ�����顣
��ʾ��ʹ��Math.random()������������һ�����С��x��O<x<1����Ȼ�����ɵ�������10������������ѭ����ξͿ�������һ���������顣

 * @author win10
 *
 */
public class Homework8 {
  public static void main(String[] args) {
	  int [] arr=new int[10];
	for(int i=0;i<arr.length;i++){
		Double d=Math.random();
		arr[i]=(int) (10*d);
		
	}System.out.println(Arrays.toString(arr));
}
}
