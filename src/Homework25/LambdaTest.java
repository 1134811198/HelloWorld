package Homework25;

import java.util.function.BiFunction;

/**
 * һ������������ʽ�ӿڣ��ӿ����������󷽷���public String getValue(String str);
��������LambdaTest�����б�д����ʹ�ýӿ���Ϊ���������������getValue���������ش������ַ���ֵ��

		ʵ��1����һ���ַ���ת���ɴ�д������Ϊ�����ķ���ֵ��
		ʵ��2����һ���ַ����ĵ�2������4������λ�ý��н�ȡ�Ӵ���

 * @author win10
 *
 */

interface Function{

	public String getValue(String str);
}
public class LambdaTest {
	public static void main(String[] args) {
				method(s->s.toUpperCase(), "hello");
	}
	
   public static String method(Function f,String s){
	return s.toUpperCase();
	   
   }

}