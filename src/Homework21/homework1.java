package Homework21;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1�����ַ���+����������ȡһ���ı��ļ���ÿ�ж�׷��һ�����á������ļ���β��׷�ӡ���ϡ���
 * @author win10
 *
 */
public class homework1 {
     public static void main(String[] args) throws IOException {
    	 BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\win10\\Desktop\\test.txt"));
    	// BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\win10\\Desktop\\test.txt"));
    	 
    	 String line;
    	 while((line=bf.readLine())!=null){
    		 
    	 System.out.println(line+"��");
    	 }
    	 if((line=bf.readLine())==null)
         System.out.println("���");
    	 bf.close();
	}
	
}
