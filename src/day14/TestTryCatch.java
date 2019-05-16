package day14;

import java.io.FileInputStream;

public class TestTryCatch {
	  public static void main(String[] args){
			
			try{FileInputStream in=new FileInputStream("myfile.txt");
			int b;	
			b = in.read();
			while(b!= -1)       {
				System.out.print((char)b);
				b = in.read();
			}}catch(Exception ex){
				
			}finally{
			in.close();}
		
	  }

}
