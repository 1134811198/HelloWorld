package Homework18;

import java.util.ArrayList;

/**
 * ��������Car�࣬����name��price���ԣ��������ȷ��������������࣬
 * ��main�����д���List�ӿڵ�ʵ���ࣨ����ʹ��LinkedList��ArrayList����
 * ���5�����ϵ�Car���󣬱�������Ԫ�أ���ÿ��С����price��10000Ԫ��
 * �ٱ������鿴price�Ƿ��Ѹı�
 * @author Administrator
 *
 */
public class homework2 {
   @SuppressWarnings("unchecked")
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	ArrayList alist=new ArrayList();
	alist.add(new Car("��ʱ��1", 100000.0));
	alist.add(new Car("��ʱ��2", 900000.0));
	alist.add(new Car("��ʱ��3", 800000.0));
	alist.add(new Car("��ʱ��4", 700000.0));
	alist.add(new Car("��ʱ��5", 600000.0));
	alist.add(new Car("��ʱ��6", 500000.0));
	
	System.out.println(alist);
	for (Object object : alist) {
		System.out.println(object);
		
	}
   /* System.out.println(alist.get(0));
    Car car1=(Car) alist.get(0);
    Car car2=(Car) alist.get(0);
    Car car3=(Car) alist.get(0);
    Car car4=(Car) alist.get(0);
    Car car5=(Car) alist.get(0);
    Car car6=(Car) alist.get(0);
    System.out.println(alist.get(0));*/
    /*car2.getPrice();
    car3.getPrice();
    car4.getPrice();
    car5.getPrice();
    car6.getPrice();*/
	for(Object obj:alist){
		((Car) obj).setPrice(((Car) obj).getPrice()-10000);
		System.out.println(obj);
		
	}
   }
	
}
class Car{
	private String name;
	private double price;
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name+"\t"+price;
	}
	
	
	
}
