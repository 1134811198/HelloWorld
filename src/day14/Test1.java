package day14;
/**
 * 1.编写一个Person类，使用Override注解它的toString方法

2.自定义一个名为“MyTiger”的注解类型，它只可以使用在方法上，带一个String类型的value属性，然后在第1题中的Person类上正确使用。
 * @author win10
 * * 
 * 一、定义注解
 * 语法：
 * 【修饰符】@interface 注解类名{
 * 		类型 方法名() [default 值];
 */
public class Test1 {

}
class Person{
	private String name;
	private String age;
@MyTiger("嘻嘻")	
@Override	

	public String toString(){
		return name+"\t"+age;
		
	}
}

@Target(value={METHOD})
@Retention(value=CLASS)
@interface MyTiger{
String value();
}