package day23;

import java.io.File;

import org.junit.Test;

public class test3 {
@Test
	public void test1() throws ClassNotFoundException{
		Class class1 =Class.forName("java.io.File");
		System.out.println(class1.getSimpleName());
	}
@Test
	public void test2(){
		File f=new File("\\DestTop\\test.txt");
		Class class2=f.getClass();
		System.out.println(class2.getSimpleName());
	}
@Test
	public void test3(){
		Class class3=File.class;
		System.out.println(class3);
		System.out.println(class3.getName());
	}
	

}
