package Homework14;
/**
 * �ġ��쳣��ҵ
���д��������׳�һ����ָ���쳣
1�����д��������׳�һ������ת���쳣
2�����д��������׳�һ����������Խ���쳣
3�����д��������׳�һ������Խ���쳣 IndexOutOfException
4�����д��������׳�һ���ַ�������Խ���쳣
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