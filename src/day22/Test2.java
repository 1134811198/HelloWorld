package day22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) throws IOException{

		Properties pro=new Properties();
		pro.load(new FileReader("F:\\eclipse\\HelloWorld\\src\\user.properties"));
	}
}
