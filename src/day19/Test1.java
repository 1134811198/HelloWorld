package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ʹ��Map��Ӽ���Ա������Ҫ�����Ա��
ֵ��Ա������

��������ʾ����>18000��Ա��

Ա���ࣺ���������ʡ����
Ҫ�������ͱ��һ����Ա��Ϊͬһ��Ա������

 * @author win10
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(new Employee2("��1",20000,1),20000);
		map.put(new Employee2("��2",30000,1),30000);
		map.put(new Employee2("��3",10000,1),10000);
		//����
		Set entrys=map.entrySet();
		for(Object entry:entrys){
			Map.Entry e=(Entry) entry;
		}
		
		System.out.println(key+":"+value);
		}
		
	}
	
	
	

}
class Employee2{
	private String name;
	private int salary;
	private int id;
	
	public Employee2(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
