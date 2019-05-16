package day16;

import java.util.Scanner;

/**
 * 输入商品名称和商品价格（double类型），要求打印效果示例：
商品名	商品价格
网球拍	123,564.59

要求：价格的小数点前面每三位用逗号隔开
 * @author win10
 *
 */
public class Test2 {
    public static void main(String[]args){
    	Scanner input=new Scanner(System.in);
    	System.out.print("请输入商品名称：");
    	
    	String name=input.next();
    	System.out.print("请输入商品价格：");
    	Double price=input.nextDouble();
    	StringBuffer s=new StringBuffer(String.valueOf(price));
    	int index=s.lastIndexOf(".");
    	for(int i=index;i-3>0;i=i-3){
    		s.insert(i-3, ",");
    	
    	}
    	System.out.println("商品名称"+"\t"+"商品价格");	
    	System.out.println(name+"\t"+s);	
    	
    	
    	
    
    }
}
