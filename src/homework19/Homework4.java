package homework19;

import java.util.HashMap;

/**
 * �ġ�����һ��ѧ���࣬�������ѧ�ź��������ԣ��������װ��Ҫ��ʹ��HashMap�������Ԫ�أ�
 * ����ѧ����Student�ࣩ��ֵ��������String���ͣ�����ѧ�ź�������һ����Ϊͬһ��ѧ����
 * @author win10
 *
 */
public class Homework4 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(new Student(1), "����");
		hm.put(new Student(2), "����");
		hm.put(new Student(3), "��ʫʫ");
		System.out.println(hm);
		
	}

}
class Student{
	private int id;
	private String name;
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Student(int id) {
		super();
		this.id = id;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
