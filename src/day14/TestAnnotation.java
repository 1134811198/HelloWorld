package day14;
/**
 * ������ע�⡿�Զ���һ��Annotation��
 * ����Teacher�࣬����say()������
 * 
 * ʹ��Annotation��  ����������ע�ͺ��Զ����Annotation
 * @author win10
 *
 */
public class TestAnnotation {

}
@Target(value={METHOD})
@Retention(value=SOURCE)
@Annotation("����")
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
