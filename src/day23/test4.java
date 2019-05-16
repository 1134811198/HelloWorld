package day23;

import java.lang.reflect.Constructor;

public class test4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
		Class c=Class.forName("bean.User");
		Constructor constructor=c.getConstructor();
		Object object=c.newInstance();
    	System.out.println(object);

    			
	}  
}

