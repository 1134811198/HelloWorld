package Homework21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
3.�ֱ�ʹ�ýڵ�����FileInputStream��FileOutputStream�ͻ�������
BufferedInputStream��BufferedOutputStreamʵ���ı��ļ�/ͼƬ/��Ƶ�ļ��ĸ��ơ����Ƚ϶��������ݸ��Ʒ����Ч�� 

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
