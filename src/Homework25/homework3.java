package Homework25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 二、
定义好Employee类，包含姓名、年龄、工资、性别属性，并封装
定义一个List类，添加多个员工
问题：针对定义好的员工的集合数据，有如下的一些需求，我们考虑如何完成？
需求1：获取当前公司中员工年龄大于30的员工信息
需求2：获取公司中工资大于 5000 的员工信息
需求3：获取性别为男的员工信息 
提示：
声明方法，参数为：函数式接口Predicate,方法体中判断test方法的返回值，如果为true，则添加到新集合，返回值：符合条件的集合对象
	public List<Employee> filterEmployee(Predicate<Employee>){}
每个需求的完成相当于调用一次filterEmployee方法，传递Lambda表达式，实现需求

 */
public class homework3 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Employee("小一",1000,18,'女'));
		list.add(new Employee("小二",5000,28,'女'));
		list.add(new Employee("小三",10000,38,'女'));
		list.add(new Employee("小四",1500,27,'男'));
		list.add(new Employee("小五",20000,58,'女'));
        
	}
   
}


 class Employee {
	
	private String name;
	private double salary;
	private int age;
	private char sex;
	Predicate<Employee> predicate=emp->boolean;
	predicate.test();
	 public List<Employee> filterEmployee(Predicate<Employee>){
    	 List l=new ArrayList();  
    	 Predicate<Employee> predicate=emp->Boolean;
    	 Boolean loop=predicate.test(emp);
				if(loop=true)
				l.add(emp);
		}
	
	
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

