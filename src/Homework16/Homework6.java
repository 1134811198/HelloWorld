package Homework16;
/**
 * 6���Լ����һ��������ģ��toUpperCase��toLowerCase
 * @author win10
 *
 */
public class Homework6 {
public static void main(String[] args) {
	char a='a';
	Homework6.toUpperCase(a);
}


public static void toUpperCase(char ch){
	int cha=ch;
	if(cha>=97&&cha<=123){
		int cha2=cha-32;
		char CH=(char)cha2;
		System.out.println(CH);
	}else
		System.out.println("������������ĸ");
}
}
