package day24;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class test2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c= Class.forName("bean.User");
		 
		
		printInterfaces(c);
	}
	public static void printInterfaces(Class c){
		Type[] getGenericInterfaces=c.getGenericInterfaces();
		for (Type getGenericInterface : getGenericInterfaces) {
			if(!(getGenericInterface instanceof ParameterizedType))
				return;
			ParameterizedType pt=(ParameterizedType) getGenericInterface;
		    Type[] types=pt.getActualTypeArguments();
		    for (Type type : types) {
				System.out.println(((Class)type).getSimpleName());
			}
		}
	}

}
