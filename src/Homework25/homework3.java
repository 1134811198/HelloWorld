package Homework25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * ����
�����Employee�࣬�������������䡢���ʡ��Ա����ԣ�����װ
����һ��List�࣬��Ӷ��Ա��
���⣺��Զ���õ�Ա���ļ������ݣ������µ�һЩ�������ǿ��������ɣ�
����1����ȡ��ǰ��˾��Ա���������30��Ա����Ϣ
����2����ȡ��˾�й��ʴ��� 5000 ��Ա����Ϣ
����3����ȡ�Ա�Ϊ�е�Ա����Ϣ 
��ʾ��
��������������Ϊ������ʽ�ӿ�Predicate,���������ж�test�����ķ���ֵ�����Ϊtrue������ӵ��¼��ϣ�����ֵ�����������ļ��϶���
	public List<Employee> filterEmployee(Predicate<Employee>){}
ÿ�����������൱�ڵ���һ��filterEmployee����������Lambda���ʽ��ʵ������

 */
public class homework3 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Employee("Сһ",1000,18,'Ů'));
		list.add(new Employee("С��",5000,28,'Ů'));
		list.add(new Employee("С��",10000,38,'Ů'));
		list.add(new Employee("С��",1500,27,'��'));
		list.add(new Employee("С��",20000,58,'Ů'));
        
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

