package homework13;

import homework13.A.B;

/**
 * �����ڲ���
��һ����A�������ж���ֲ��ڲ���B��B����һ��˽�г���name����һ������show()��ӡ����name�����в��� 
���ף�A��Ҳ����һ��˽�еı���name����show�����д�ӡ���� 

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