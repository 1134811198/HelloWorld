package Day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1. 改写程序TextFile.java，使用Buffered包装形式读取TextFile.java文本文件，
 * 为每行加上行号，再连同内容一并输出到屏幕上
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
