package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 使用Map添加几个员工对象，要求键：员工
值：员工工资

并遍历显示工资>18000的员工

员工类：姓名、工资、编号
要求：姓名和编号一样的员工为同一个员工！！

 * @author win10
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(new Employee2("张1",20000,1),20000);
		map.put(new Employee2("张2",30000,1),30000);
		map.put(new Employee2("张3",10000,1),10000);
		//遍历
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
