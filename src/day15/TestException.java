package day15;

import java.util.Scanner;

public class TestException {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������û���");
		String name = input.next();
		System.out.println("����������");
		String code = input.next();
		try{if("John".equals(input))
			throw new NameInputException();
		{
			if("000".equals(input))
				throw new CodeInputException();
				System.out.println("�û���������������ȷ");
			{
				System.out.println("�����������");
			}
				}
		{
			System.out.println("�û����������");
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
			
				
			
			
		
		
	}

}class ATM{
	private String name;
	private String code;
	
}
class NameInputException extends RuntimeException{
	public NameInputException(){
		
	}
}
class CodeInputException extends RuntimeException{
	public CodeInputException(){
		
	}
}