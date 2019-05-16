package day15;

import java.util.Scanner;

public class TestException {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名");
		String name = input.next();
		System.out.println("请输入密码");
		String code = input.next();
		try{if("John".equals(input))
			throw new NameInputException();
		{
			if("000".equals(input))
				throw new CodeInputException();
				System.out.println("用户名和密码输入正确");
			{
				System.out.println("密码输入错误");
			}
				}
		{
			System.out.println("用户名输入错误");
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