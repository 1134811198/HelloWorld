package Homework18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * һ������һ��Employee�࣬
���������private��Ա����name,age,birthday ���Զ���MyDate���ͣ�������������գ�
��Ϊÿһ�����Զ��� getter, setter ������
����д toString ������� name, age, birthday
��Ϊ name��birthdayһ����Ϊͬһ��Ա��
ʹ��ArrayList�������Ա�����󣬲���age��������

������Ϊ2000���Ժ������ɾ����

 * @author win10
 *
 */
public class homework1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		 MyDate birthday1=new MyDate(2010,10,5);
		 MyDate birthday2=new MyDate(1998,1,10);
		 MyDate birthday3=new MyDate(1990,3,4);
		 Employee emp1=new Employee("Lily",8,birthday1);
		 Employee emp2=new Employee("Lucy",20,birthday2);
		 Employee emp3=new Employee("Jack",28,birthday3);
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
       System.out.println(al);
       for(int i=0;i<al.size();i++){
    	   emp1.getAge();
    	   emp2.getAge();
    	   emp3.getAge();
    	   
    		}

    	}
		
		
			    
	}
class Employee{
	private String name;
	private int age;
	private MyDate birthday;
		
	public Employee(String name, int age, MyDate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public String toString(){
		return name+"\t"+age+"\t"+birthday;
		
	}
	/**
	
	public void getSame(String n,MyDate b){
		if(name.equals(n)&&birthday.equals(b))
		System.out.println("��ͬһ��Ա��");
		else 
		System.out.println("����ͬһ��Ա��");
	}
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	
}
class MyDate{
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public String toString() {
		return   year + "\t" + month + "\t" + day ;
	}

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
	
	
}
