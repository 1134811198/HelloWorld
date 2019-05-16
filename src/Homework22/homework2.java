package Homework22;

import java.io.File;

/**
 * 二、在main方法中创建并启动两个线程。
第一个线程统计指定目录下的文件个数及所占总空间数并打印输出，
另一个线程打印输出此目录中每个文件信息如文件名称和大小。
 * @author win10
 *C:\Users\win10\Desktop
 */
public class homework2 {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Thread1());
		Thread t2=new Thread(new Thread2());
		t1.start();
		//t2.start();
	}

}
class Thread1 implements Runnable{
	int i=0;
	 long lo=0;
	@Override
	public void run() {
		File file=new File("C:\\Users\\win10\\Desktop\\test");
			 digui(file);
			 System.out.println("文件个数是："+i+","+"所占空间："+lo);
	}

	private void digui(File file) {
		 File [] subfiles=file.listFiles();
	         
		for (File subfile : subfiles) {
			
			if(subfile.isFile()){
				i++;
				lo=lo+subfile.getTotalSpace();
			}else {
				digui(subfile);
			}
		}
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		File file=new File("C:\\Users\\win10\\Desktop\\test");
		 digui(file);
		 
}

private void digui(File file) {
	 File [] subfiles=file.listFiles();
       
		 long lo=0;
	for (File subfile : subfiles) {
		
		if(subfile.isFile()){
			subfile.getName();
			lo=lo+subfile.getTotalSpace();
		}else if(subfile.isDirectory()){
			digui(subfile);
		}System.out.println("文件名是："+subfile.getName()+","+"所占空间："+lo);
	}
}
	}
	

