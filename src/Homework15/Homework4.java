package Homework15;



/**4�������ַ������ж������ж��ٸ���д��ĸ�����ٸ�Сд��ĸ�����ٸ�����
 * 
 * @author win10
 *
 */
public class Homework4 {
public static void main(String[]args){
	String s="AB1";
	char[] c=s.toCharArray();
	int n=0;
	if(Character.isUpperCase(c[0])){
		n=n+1;
	}else
		n=n;
	if(Character.isUpperCase(c[1])){
		n=n+1;
	}else
		n=n;
	if(Character.isUpperCase(c[2])){
		n=n+1;
	}else
		n=n;
	int m=n;
	System.out.println(m);
	int n1=0;
	if(Character.isLowerCase(c[0])){
		n1=n1+1;
	}else
		n1=n1;
	if(Character.isLowerCase(c[1])){
		n1=n1+1;
	}else
		n1=n1;
	if(Character.isLowerCase(c[2])){
		n1=n1+1;
	}else
		n1=n1;
	int m1=n1;
	System.out.println(m1);
	int n11=0;
	if(Character.isDigit(c[0])){
		n11=n11+1;
	}else
	  n11=n11;
	if(Character.isDigit(c[1])){
		n11=n11+1;
	}else
		n11=n11;
	if(Character.isDigit(c[2])){
		n11=n11+1;
	}else
		n11=n11;
	int m11=n11;
	System.out.println(m11);
	
	
}
}
