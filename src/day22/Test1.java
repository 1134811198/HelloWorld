package day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test1 {

	public static void main(String[] args) throws IOException {
	    
	    	System.out.println("ÇëÊäÈë×Ö·û£º");
	    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String s=new String(br.readLine().toUpperCase());
		OutputStreamWriter bw=new OutputStreamWriter(new FileOutputStream("C:\\Users\\win10\\Desktop\\test.txt"));
		bw.write(s);
		if(s=="e")
		
		bw.close();
		br.close();
		
	}

}
