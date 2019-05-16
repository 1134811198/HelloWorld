package homework13;
/**
 * 二、计算器具有work方法，功能是运算，有一个手机类Cellphone，
 * 定义方法testWork测试计算功能，调用计算接口的work方法，
要求调用CellPhone对象 的testWork方法，使用上 匿名内部类

 * @author win10
 *
 */
public class TestWork {
	public static void main(String[]args){
	Cellphone CellPhone = new Cellphone();
	CellPhone.cale(new Calculater(){
		public void work(){
			System.out.print("运算");
		}
	});
	
	}
	

}
class Cellphone{
	public void cale(Calculater cl){
		cl.work();
	}
	
}
interface Calculater{
	void work();
}