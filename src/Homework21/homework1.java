package Homework21;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1、（字符流+缓冲流）读取一个文本文件，每行都追加一个“好”，在文件结尾再追加“完毕”。
 * @author win10
 *
 */
public class homework1 {
     public static void main(String[] args) throws IOException {
    	 BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\win10\\Desktop\\test.txt"));
    	// BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\win10\\Desktop\\test.txt"));
    	 
    	 String line;
    	 while((line=bf.readLine())!=null){
    		 
    	 System.out.println(line+"好");
    	 }
    	 if((line=bf.readLine())==null)
         System.out.println("完毕");
    	 bf.close();
	}
	
}
