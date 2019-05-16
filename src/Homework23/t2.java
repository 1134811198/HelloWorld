package Homework23;

import java.util.HashSet;

/*
 * 2、定义HashSet集合，保存三个Person对象
 */
public class t2 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Person("John"));
		hs.add(new Person("Lucy"));
		hs.add(new Person("Jack"));
	}
}
class Person{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}