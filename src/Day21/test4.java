package Day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test4 {
   public static void main(String[] args)  {
	FileInputStream fis=null;
    FileOutputStream fos=null;
			try {
				fis=new FileInputStream("C:\\Users\\win10\\Desktop\\����.txt");
				fos=new FileOutputStream("C:\\Users\\win10\\Desktop\\����2.txt",true);

   byte [] b=new byte[1024];
   fis.read(b);

   int len;
   while((len=fis.read(b))!=-1){
  	
fos.write(b, 0,len);
   }
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  finally{
        try {
			if(fos!=null)
			fos.close();
			if(fis!=null)
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
   }
   
	
}
