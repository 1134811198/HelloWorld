package Homework18;

import java.util.ArrayList;

/**
 * 二、创建Car类，包含name，price属性，构造器等方法，创建测试类，
 * 在main方法中创建List接口的实现类（可以使用LinkedList或ArrayList），
 * 添加5个以上的Car对象，遍历集合元素；把每个小车的price降10000元，
 * 再遍历，查看price是否已改变
 * @author Administrator
 *
 */
public class homework2 {
   @SuppressWarnings("unchecked")
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	ArrayList alist=new ArrayList();
	alist.add(new Car("保时捷1", 100000.0));
	alist.add(new Car("保时捷2", 900000.0));
	alist.add(new Car("保时捷3", 800000.0));
	alist.add(new Car("保时捷4", 700000.0));
	alist.add(new Car("保时捷5", 600000.0));
	alist.add(new Car("保时捷6", 500000.0));
	
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
