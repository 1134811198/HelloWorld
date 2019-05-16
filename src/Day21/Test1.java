package Day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		Collections.shuffle(list);
		
	}
	interface MyBiConsumer<T>{
		static U u;
		public <T> void method1(T t,U u){
			
		}
		public U method2(T t){
			
		}
		
	}

}
