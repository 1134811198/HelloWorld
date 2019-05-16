package day24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import bean.User;

public class test1 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c=Class.forName("bean.User");
		printConstructors(c);
	}
    public static void printConstructors(Class c){
    	Constructor [] constructors= c.getDeclaredConstructors();
     for (Constructor constructor : constructors) {
    	 //修饰符
		int mod=constructor.getModifiers();
		String modifier=Modifier.toString(mod);}
		//参数列表
		Field[] fields=User.class.getDeclaredFields();
		StringBuilder builder=new StringBuilder();
		for (Field field : fields) {
			String name =field.getName();
			builder.append(name+",");	
			}
		builder.substring(0, fields.length-1);
		
     
	}
    }

