package Homework23;
/*
 * 1������ӿ�A�������г��󷽷�run���з��أ����������������������Abas�̳�A��
��������󷽷�fly���޷��أ���һ������������ʵ����Sub�̳г�����Abas����ʵ����֪��Comparable�ӿ�
 */
public class t1 {

	public static void main(String[] args) {
		
	}
}
interface A{
	String run(String s1,String s2);
}
abstract class Abas implements A{
	abstract void fly(String s);
}
class Sub extends Abas implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void fly(String s) {
		// TODO Auto-generated method stub
		
	}
	
}