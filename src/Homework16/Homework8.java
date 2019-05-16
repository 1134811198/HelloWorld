package Homework16;

import java.util.Arrays;

/**
 * 8、利用随机数生成一个整数数组，数组中有10个元素，每个元素的值都在0-9之间，打印该数组。
提示：使用Math.random()方法可以生成一个随机小数x（O<x<1），然后将生成的数扩大10倍后再求整，循环多次就可以生成一个整数数组。

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
