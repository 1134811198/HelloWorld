package day24;
/**
 * ����Class���forName�����õ�File�ࣨ��
	ͨ��newInstance�ķ�������File���󣬲�����D��\mynew.txt�ļ� 
 */
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Method;

public class test6 {
		public static void main(String[] args) throws Exception {
			//1.��ȡFile��Ķ�ӦClass�����
			Class c = Class.forName("java.io.File");
			
			
			//2.ͨ�����䷽ʽ����File����
//			File(String) new File();
			Constructor constructor = c.getConstructor(String.class);
			
			Object object = constructor.newInstance("E:\\mynew.txt");
			
			
			//3.����File�����createNewFile����
			
			Method method = c.getMethod("createNewFile");
			Object returnValue = method.invoke(object);
			
			System.out.println((Boolean)returnValue?"�����ɹ�":"����ʧ��");
		}

	}
		
		

