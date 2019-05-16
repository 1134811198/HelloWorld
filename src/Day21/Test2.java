package Day21;

import java.io.File;

import org.junit.Test;

public class Test2 {
	public static void main(String[] args) {
		File file=new File("F:\\李玉婷（老师）(34363B73201C)\\day19");
		String[] list=file.list();
		for(String string:list){
			System.out.println(string);
		}
		File[] listFile=file.listFiles();
		for (File file2 : listFile) {
			System.out.println(file2.getName());
		}
	}
	@Test
	public void test1(){
		File file=new File("F:\\李玉婷（老师）(34363B73201C)\\day19");
		digui(file);
		
	}
	public void digui(File file) {
		File[] subFiles=file.listFiles();
		for (File sub : subFiles) {
			System.out.println(sub.getName());
			if(sub.isDirectory()){
				digui(sub);
			}else{
				System.out.print(sub.getName());
			}
		}
	}

}
