package src.day26;

public class test1 {
	@test
private void myte1() {
	// TODO Auto-generated method stub
		 
}
}


class MyClass{
	public void run(){
		System.out.println("≈‹∞°≈‹∞°");
	}
	public static void cale(int a,int b){
		System.out.println(a+b);
	}
	
	public static double sum(double d1,double d2,double d3){
		return d1+d2+d3;
	}
	public  String concat(double d1,double d2,double d3){
		return "hi:"+d1+d2+d3;
	}
//	C<Double,String> c=MyClass::concat;
	public String max(Integer...is){
		int max=is[0];
		for (int i = 0; i < is.length; i++) {
			if(max<is[i])
				max=is[i];
		}
		return "◊Ó¥Û÷µ£∫"+max;
	}
//	D<Integer,String> d=MyClass::max;

	public char getCharacter(String str,int index){
		return str.charAt(index);
	}
}
interface A{
	void method1();
}

interface B<T>{
	void method2(T t1,T t2);
}
interface C<T,R>{
	R method3(T t1,T t2,T t3);
}
interface D<T,R>{
	R method4(T...ts);
}
interface E<T,R,U,M>{
	M method5(T t,R r,U u);
}