package Day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\win10\\Desktop\\1.txt");
//	    int read;
//	    while((read=fis.read())!=-1){
//	    	System.out.print((char)read);
//	    }
//	   
	    byte [] b=new byte[5];
	    int length;
	    while((length=fis.read(b))!=-1){
	    	System.out.print(new String(b,0,length));
	    	
	    	
	    }
	    fis.close();
	    
	}

}
