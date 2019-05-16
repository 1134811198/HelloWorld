package day14;
/**
 * 三、【注解】自定义一个Annotation，
 * 定义Teacher类，定义say()方法，
 * 
 * 使用Annotation的  三个基本的注释和自定义的Annotation
 * @author win10
 *
 */
public class TestAnnotation {

}
@Target(value={METHOD})
@Retention(value=SOURCE)
@Annotation("哈哈")
@interface Annotation{
	String value();
}
class Teacher{
	public void say(){
		
	}
}

class YoungTeacher extends Teacher{
@Override	
public void say(){
		
	}
}
