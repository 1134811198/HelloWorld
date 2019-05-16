package day25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class test4 {

	public static void main(String[] args) throws Exception {
	Socket socket=new Socket("192.168.16.58",8888);
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\win10\\Desktop\\111.jpg"));
    BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
    streamToByteArray(bis);}
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

