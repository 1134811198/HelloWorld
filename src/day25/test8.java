package day25;

import java.util.function.BiFunction;

public class test8 {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> bifunction=(o1,o2)->o1*o2;
		bifunction.apply(2,3);
		System.out.println(bifunction.apply(2,3));
	}
	

}
