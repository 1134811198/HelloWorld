package day23;

import java.lang.reflect.Field;

public class test5ReflectTest {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("day23.PrivateTest");
		Field field=c.getDeclaredField("name");
		field.setAccessible(true);
		Object object=c.newInstance();		
		field.set(object, "byebye");
		System.out.println(field.get(object));
				
		
	}

}
class PrivateTest{
	private String name="hellokitty";

	public PrivateTest(String name) {
		super();
		this.name = name;
	}

	public PrivateTest() {
		super();
	}

	public String getName() {
		return name;
	}
	
	
}