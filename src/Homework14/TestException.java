package Homework14;
/**
 * 四、异常作业
请编写程序举例抛出一个空指针异常
1、请编写程序举例抛出一个类型转换异常
2、请编写程序举例抛出一个数组索引越界异常
3、请编写程序举例抛出一个索引越界异常 IndexOutOfException
4、请编写程序举例抛出一个字符串索引越界异常
String s = "abc";
s.charAt(9);

 * @author win10
 *
 */
public class TestException {	
	 public static void main(String[] args){
		 int i=10;
			try{
				String[]names=new String[3];
				
				Student s= (Teacher)new Student();//
				
				if(names[1].equals("John"))//NullPionterException
					System.out.println(names[1]);
				
				else{
					
					names[3]="Lucy";//ArrayIndexOutOfBoundsException
				}
				
			}catch(Throwable e){
				return;
			} 
	 }
	public static String method(){
		int i=10;
		try{
			String[]names=new String[3];
			
			Student s= (Teacher)new Student();//
			
			if(names[1].equals("John"))//NullPionterException
				System.out.println(names[1]);
			
			else{
				names[3]="Lucy";//ArrayIndexOutOfBoundsException
			}
			
		}catch(Throwable e){
			return e.getMessage();
		}
		return null;
	}
}
class Person{
	
}
class Student extends Person{
	
}
class Teacher extends Student{
	
}