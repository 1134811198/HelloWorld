package homework13;
/**
 * �ġ�����һ����ͨ���߽ӿ���Vehicles����work�ӿڣ���Horse���Boat��ֱ�ʵ��Vehicles��
 * ������ͨ���߹����࣬�����������ֱ��ý�ͨ����Horse��Boat����Person�࣬��name��Vehicles���ԣ�
 * �ڹ�������Ϊ�������Ը�ֵ��ʵ����Person������ɮ����Ҫ��һ���������Horse��Ϊ��ͨ���ߣ��������ʱ��Boat��Ϊ��ͨ���ߡ�
 * @author win10
 *
 */
public class TestVehicle {
  public static void main(String[]args){
	  Person p1=new Person("��ɮ","1");
	  Person p2=new Person("��ɮ","2");
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
		System.out.println("��ý�ͨ������");	
	}
    public void getVehicle2(){
    	System.out.println("��ý�ͨ���ߴ�");
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
		if(situation=="1")//"1"Ϊһ�������
			System.out.println("��ͨ����Ϊ��");
		if(situation=="2")//"2"Ϊ�������
			System.out.println("��ͨ����Ϊ��");
			
		return Vehicle;
	}
	public void setVehicle(String vehicle) {
		Vehicle = vehicle;
	}
	
}