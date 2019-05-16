package day18;

import java.util.ArrayList;

import java.util.List;

public class TestArrayList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list);
		list.add(2,"张三");
		System.out.println(list);
		System.out.println(list.get(5));
		list.remove(6);
		System.out.println(list);
		list.set(7, 22);
		System.out.println(list);
		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
		al.add(0, "好的");
		
	}


}
