package day25;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class test6 {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://192.168.16.69:8080/rb.jpg");
	URLConnection connection=url.openConnection();
	InputStream  inputstream=connection.getInputStream();
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\win10\\Desktop\\rbrb.jpg"));
	streamToByteArray(inputstream);
	
		}
	   public static byte[] streamToByteArray(InputStream is) throws Exception{
				ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建输出流对象
				byte[] b = new byte[1024];
				int len;
				while((len=is.read(b))!=-1){
					bos.write(b, 0, len);
					
				}		
				byte[] array = bos.toByteArray();	
				bos.close();
				return array;
			
	}
	   
}

