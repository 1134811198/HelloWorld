package day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  1.	����Collections.sort()������
 *  ͨ����������Ƚ�����Employee(�Ȱ�����ȣ�������ͬ��������),
 *  ʹ��Lambda���ʽ��Ϊ�������ݡ�
 * @author win10
 *
 */
public class test7 {

	public static void main(String[] args) {
		Employee emp1=new Employee("lily",10000,18,'Ů');
		Employee emp2=new Employee("lucy",20000,27,'��');
		List list=new ArrayList();
		list.add(emp1);
		list.add(emp2);
		
		Collections.sort();
		new Comparator(){public int compare(emp1,emp2){
			if(emp1.getAge()>=emp2.getAge())
			return 1;
			else}
		}
	}

}

 class Employee {
	
	private String name;
	private double salary;
	private int age;
	private char sex;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sex;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Employee(String name, double salary, int age, char sex) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + ", sex=" + sex + "]";
	}
	

}
