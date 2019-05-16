package Day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\win10\\Desktop\\込込.txt");
		FileWriter fw =new FileWriter("C:\\Users\\win10\\Desktop\\込込.txt");
	    int data;
//	    while((data=fr.read())!=-1){
//	    	System.out.print((char)data);
//	    }
	    char [] cbuf=new char[2];
	    while((data=fr.read(cbuf))!=-1){
	    	System.out.println(new String(cbuf,0,data));
	    }
	    while(){
	    	
	    }
	  
	    	fr.close();
	}
}
