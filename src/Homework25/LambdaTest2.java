package Homework25;
/**
 * ����������һ�����������͵ĺ���ʽ�ӿڣ���������Ϊ<T,R> : T Ϊ������R Ϊ����ֵ��
�ڽӿ���������Ӧ���󷽷�
����LambdaTest��������������ʹ�ýӿ���Ϊ���������ýӿڵĳ��󷽷�����ӡ����ֵ

ʵ��1����������long�Ͳ����ĺ͡�
ʵ��2���ټ�������long�Ͳ����ĳ˻�
 */

interface Fuunction<T,R>{
	R Apply(T t);
}
public class LambdaTest2{
	public static void main(String[] args) {
		Fuunction<Long,Long> fuunction=(l1,l2)->l1+l2;
	   System.out.println(l1+l2);
	}
		public long Apply(long l1,long l2){
		return l1+l2;	
	//	return l1*l2;
	}
}
