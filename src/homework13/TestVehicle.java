package homework13;
/**
 * 四、：有一个交通工具接口类Vehicles，有work接口，有Horse类和Boat类分别实现Vehicles，
 * 创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat；有Person类，有name和Vehicles属性，
 * 在构造器中为两个属性赋值，实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具。
 * @author win10
 *
 */
public class TestVehicle {
  public static void main(String[]args){
	  Person p1=new Person("唐僧","1");
	  Person p2=new Person("唐僧","2");
	  p1.getVehicle();
	  p2.getVehicle();
	  
  }
}
interface Vehicles{
	void work();
}
class Horse implements Vehicles{
	public void work(){
		
	}
}
class Boat implements Vehicles{
    public void work(){
		
	}
}
class Factory{
	public void getVehicle1(){
		System.out.println("获得交通工具马");	
	}
    public void getVehicle2(){
    	System.out.println("获得交通工具船");
	}
}
class Person{
	private String name;
	private String Vehicle;
	private String situation;
	
	public Person(String name, String situation) {
		super();
		this.name = name;
		this.situation = situation;
	}


	public Person(String name) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicle() {
		if(situation=="1")//"1"为一般情况下
			System.out.println("交通工具为马");
		if(situation=="2")//"2"为遇到大河
			System.out.println("交通工具为船");
			
		return Vehicle;
	}
	public void setVehicle(String vehicle) {
		Vehicle = vehicle;
	}
	
}