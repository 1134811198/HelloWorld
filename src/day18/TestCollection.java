package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	c1.add("Lily");
	c1.add(10);
	c1.add(true);
	c1.add(new Double(2.5));
	System.out.println(c1);
	Collection c2=new ArrayList();
	c2.add('A');
	c2.add(99);
	System.out.println(c2);
	c1.addAll(c2);
	System.out.println(c1);
	c1.remove(10);
	c1.removeAll(c2);
	System.out.println(c1);
	
	c1.add(new Book("战狼",55.0));
	c1.add(new Book("春风十里",44.0));
	c1.add(new Book("捉妖记",33.0));
	System.out.println(c1);
	//迭代器遍历
	Iterator iter=c1.iterator();
	while(iter.hasNext()){
		Object obj=iter.next();
		System.out.println(obj);
	}	
	//增强for循环遍历
	for(Object obj:c1){
		System.out.println(obj);
	}
}
}


