package Homework16;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 9、求两个日期之间相隔的天数
写一个方法(例如：fun3(Calendar c1,Calendar c2) )，
求两个日期2010-09-20 与 2010-09-21 之间相隔的天数

 * @author win10
 *
 */
public class Homework9 {
public static void main(String[] args) throws ParseException {
	
	System.out.println("请输入日期1");
	Scanner input=new Scanner(System.in);
	String s1=input.next();
	System.out.println("请输入日期2");
	String s2=input.next();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");

		Date D1=df.parse(s1);
		Date D2=df.parse(s2);
		Homework9 h=new Homework9();
	
	System.out.println("相隔天数是:"+h.fun3(D1,D2));
}
public int fun3(Date d1,Date d2){
if(d1.getTime()>d2.getTime())
	return (int) ((d1.getTime()-d2.getTime())/86400000);
	else if(d1.getTime()<d2.getTime())
		return (int)((d2.getTime()-d1.getTime())/86400000);
	else 
      return 0;
}
}
