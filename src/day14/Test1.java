package day14;
/**
 * 1.��дһ��Person�࣬ʹ��Overrideע������toString����

2.�Զ���һ����Ϊ��MyTiger����ע�����ͣ���ֻ����ʹ���ڷ����ϣ���һ��String���͵�value���ԣ�Ȼ���ڵ�1���е�Person������ȷʹ�á�
 * @author win10
 * * 
 * һ������ע��
 * �﷨��
 * �����η���@interface ע������{
 * 		���� ������() [default ֵ];
 */
public class Test1 {

}
class Person{
	private String name;
	private String age;
@MyTiger("����")	
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