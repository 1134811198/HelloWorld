package Homework25;

import java.util.function.BiFunction;

/**
 * 一、①声明函数式接口，接口中声明抽象方法：public String getValue(String str);
②声明类LambdaTest，类中编写方法使用接口作为参数，方法体调用getValue方法，返回处理后的字符串值。

		实现1：将一个字符串转换成大写，并作为方法的返回值。
		实现2：将一个字符串的第2个到第4个索引位置进行截取子串。

 * @author win10
 *
 */

interface Function{

	public String getValue(String str);
}
public class LambdaTest {
	public static void main(String[] args) {
				method(s->s.toUpperCase(), "hello");
	}
	
   public static String method(Function f,String s){
	return s.toUpperCase();
	   
   }

}