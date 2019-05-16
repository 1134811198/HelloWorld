package Homework21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
3.分别使用节点流：FileInputStream、FileOutputStream和缓冲流：
BufferedInputStream、BufferedOutputStream实现文本文件/图片/视频文件的复制。并比较二者在数据复制方面的效率 

 * @author win10
 *
 */
public class homework2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\win10\\Desktop\\test.txt");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\win10\\Desktop\\copytest.txt");
		byte [] b=new byte[3];
		int len;
		while((len=fis.read(b))!=-1){
			fos.write(b,0,len);
		}
		fis.close();
		fos.close();
	}
}
