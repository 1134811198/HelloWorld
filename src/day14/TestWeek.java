package day14;

import java.util.Scanner;

public class TestWeek {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入：");

		int num = input.nextInt();
		
		Week[] values = Week.values();
		//查找有无指定数字的日期
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
	MONDAY("星期一"),
	TUESDAY("星期二"),
	WEDNESDAY("星期三"),
	THURSDAY("星期四"),
	FRIDAY("星期五"),
	SATURDAY("星期六"),
	SUNDAY("星期日");
	
	public String toString(){
		return name;
	}
	private Week(String name){
		this.name=name;
	}
	private String name;
}