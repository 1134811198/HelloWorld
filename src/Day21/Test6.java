package Day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1. ��д����TextFile.java��ʹ��Buffered��װ��ʽ��ȡTextFile.java�ı��ļ���
 * Ϊÿ�м����кţ�����ͬ����һ���������Ļ��
 * @author win10
 *
 */
public class Test6 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new FileReader("F:\\eclipse\\HelloWorld\\src\\TextFile\\TestFile.java"));
	    BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\eclipse\\HelloWorld\\src\\TextFile\\TestFile.java"));
	    String line;
	    while((line=bf.readLine())!=null){
	    	System.out.print(line);
	    }
	    bw.close();
	    bf.close();
	}
}
