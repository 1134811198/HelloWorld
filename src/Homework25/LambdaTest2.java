package Homework25;
/**
 * 二、①声明一个带两个泛型的函数式接口，泛型类型为<T,R> : T 为参数，R 为返回值。
②接口中声明对应抽象方法
③在LambdaTest类中声明方法，使用接口作为参数，调用接口的抽象方法，打印返回值

实现1：计算两个long型参数的和。
实现2：再计算两个long型参数的乘积
 */

interface Fuunction<T,R>{
	R Apply(T t);
}
public class LambdaTest2{
	public static void main(String[] args) {
		Fuunction<Long,Long> fuunction=(l1,l2)->l1+l2;
	   System.out.println(l1+l2);
	}
		public long Apply(long l1,long l2){
		return l1+l2;	
	//	return l1*l2;
	}
}
