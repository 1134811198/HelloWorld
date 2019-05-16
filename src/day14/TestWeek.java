package day14;

import java.util.Scanner;

public class TestWeek {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����룺");

		int num = input.nextInt();
		
		Week[] values = Week.values();
		//��������ָ�����ֵ�����
		Week week = null;
		for(int i=0;i<values.length;i++){
			if(values[i].ordinal()==num-1){
				week = values[i];
				break;
			}
		}
		printWeek(week);
		
	}
	public static void printWeek(Week week){
		System.out.println(week);
	}

}

enum Week{
	MONDAY("����һ"),
	TUESDAY("���ڶ�"),
	WEDNESDAY("������"),
	THURSDAY("������"),
	FRIDAY("������"),
	SATURDAY("������"),
	SUNDAY("������");
	
	public String toString(){
		return name;
	}
	private Week(String name){
		this.name=name;
	}
	private String name;
}