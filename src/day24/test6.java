package day24;
/**
 * 利用Class类的forName方法得到File类（）
	通过newInstance的方法创建File对象，并创建D：\mynew.txt文件 
 */
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Method;

public class test6 {
		public static void main(String[] args) throws Exception {
			//1.获取File类的对应Class类对象
			Class c = Class.forName("java.io.File");
			
			
			//2.通过反射方式创建File对象
//			File(String) new File();
			Constructor constructor = c.getConstructor(String.class);
			
			Object object = constructor.newInstance("E:\\mynew.txt");
			
			
			//3.调用File对象的createNewFile方法
			
			Method method = c.getMethod("createNewFile");
			Object returnValue = method.invoke(object);
			
			System.out.println((Boolean)returnValue?"创建成功":"创建失败");
		}

	}
		
		

