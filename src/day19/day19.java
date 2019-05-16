package day19;

import java.util.TreeSet;

/**
 * ����һ��Employee�࣬
���������private��Ա����name,age,birthday������ birthday Ϊ MyDate��Ķ���
��Ϊÿһ�����Զ��� getter, setter ������
����д toString ������� name, age, birthday
��Ϊ name��birthdayһ����Ϊͬһ��Ա��

 */
public class day19 {
   public static void main(String[] args) {
	TreeSet<Employee> ts=new TreeSet<Employee>();
	ts.add(new Employee("����",18,new MyDate(2000,10,5)));
	ts.add(new Employee("����",28,new MyDate(1999,1,6)));
	ts.add(new Employee("����",38,new MyDate(2012,3,8)));
	ts.add(new Employee("��һ",28,new MyDate(1999,1,6)));
	ts.add(new Employee("�߶�",38,new MyDate(2012,3,8)));
	for (Employee employee : ts) {
		System.out.println(employee);
	}
	
	
   }
}
class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private MyDate birthday;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	public Employee(String name, int age, MyDate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	
	@Override
	public int compareTo(Employee e) {
		
		return this.name.compareTo(e.name);
	}
	

}
class MyDate{
	private int year;
	private int month;
	private int day;
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
}