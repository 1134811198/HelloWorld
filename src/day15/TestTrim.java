package day15;

public class TestTrim {
public static void main(String[]args){
	String s=" 12  ";
	System.out.println(s.substring(1,3)+"�õ�");
	System.out.println(s.trim()+"�õ�");
	System.out.println(s.substring(s.indexOf(s.charAt(1)),s.indexOf(s.charAt(2))+1)+"�õ�");
}
}
