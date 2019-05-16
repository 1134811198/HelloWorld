package homework13;

import homework13.A.B;

/**
 * 三、内部类
编一个类A，在类中定义局部内部类B，B中有一个私有常量name，有一个方法show()打印常量name。进行测试 
进阶：A中也定义一个私有的变量name，在show方法中打印测试 

 * @author win10
 *
 */
public class testShow {
	public static void main(String[]args){
		
		A.B.show();
		B.show();
	}

}
class A{
	private String name;
	A a = new A("Jack");
	
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}

	public A(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 static class B{
		private final static String name="Cindy";
		
		@Override
		public String toString() {
			return " B[name=" + name + "]";
		}

		public static void show(){
			System.out.println(name);
			
		}
	}
}