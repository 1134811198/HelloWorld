package Homework23;
/*
 * 1、定义接口A，里面有抽象方法run，有返回，有两个参数，定义抽象类Abas继承A，
并定义抽象方法fly，无返回，有一个参数，定义实现类Sub继承抽象类Abas，并实现已知的Comparable接口
 */
public class t1 {

	public static void main(String[] args) {
		
	}
}
interface A{
	String run(String s1,String s2);
}
abstract class Abas implements A{
	abstract void fly(String s);
}
class Sub extends Abas implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void fly(String s) {
		// TODO Auto-generated method stub
		
	}
	
}