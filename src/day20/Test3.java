package day20;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List list=new ArrayList();
	    
		list.add("john");
		list.add("emmy");
		list.add("jack");
		list.add("john");
		
		System.out.println(Collections.max(list));
		//°´×ÔÈ»ÅÅÐò
		System.out.println(Collections.max(list, null));
		
	}
	class Student{
		private String name;

		public Student(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	
		
		
	}
