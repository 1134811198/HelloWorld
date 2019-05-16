package Day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

/**
 * ��дPerson�࣬�������������䡢���ص����ԣ��ṩ��Ӧ�ķ��ʷ�����
��д������1����main�����д���������ͬ��Person���󣬽��������������л����ļ��У�
��д������2����main�����д��ļ��з����л�����Person���󣬴�ӡ�������֤���л�����ȷ��
�ڲ�����1�У�������Person����ŵ������У����л������鵽һ���������ļ��С��ٽ�����Person����ŵ�List�����У����л��ü��ϵ���һ���������ļ��У�
�ڲ�����2�У�������Person����������ļ��з����л�������ӡ��
������Person�����List�����ļ��з����У�����ӡ����֤�������ͼ��϶�������л�
 * @author win10
 *
 */
public class Test7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1=new Person("lucy",18,48.5);
		Person p2=new Person("lily",28,50.0);
		Person p3=new Person("jack",17,55.0);
		File file=new File("object.dat");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person p=(Person) ois.readObject();
		System.out.println(p);
	}
	

}
class Person{
	private String name;
	private int age;
	private double weight;
	
	public Person(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
