package day16;

import java.util.Scanner;

/**
 * ������Ʒ���ƺ���Ʒ�۸�double���ͣ���Ҫ���ӡЧ��ʾ����
��Ʒ��	��Ʒ�۸�
������	123,564.59

Ҫ�󣺼۸��С����ǰ��ÿ��λ�ö��Ÿ���
 * @author win10
 *
 */
public class Test2 {
    public static void main(String[]args){
    	Scanner input=new Scanner(System.in);
    	System.out.print("��������Ʒ���ƣ�");
    	
    	String name=input.next();
    	System.out.print("��������Ʒ�۸�");
    	Double price=input.nextDouble();
    	StringBuffer s=new StringBuffer(String.valueOf(price));
    	int index=s.lastIndexOf(".");
    	for(int i=index;i-3>0;i=i-3){
    		s.insert(i-3, ",");
    	
    	}
    	System.out.println("��Ʒ����"+"\t"+"��Ʒ�۸�");	
    	System.out.println(name+"\t"+s);	
    	
    	
    	
    
    }
}
