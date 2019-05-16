package Homework22;

import java.io.File;

public class h {
public static void main(String[] args) {
	File file =new File("C:\\Users\\win10\\Desktop\\test");
	
	Thread11 t1 =new Thread11(file);
	
	
	t1.start();
	
  }
}
class Thread11 extends Thread{
	File file;
	int count=0;
	long len=0;
	public Thread11(File file){
		this.file=file;
	}
	@Override
	public void run() {
          digui(file);
          System.out.println("文件个数:"+count);
          System.out.println("总文件大小:"+len);
	}
    public void digui(File file){
    	 File[] subFiles = file.listFiles();
    	for (File file2 : subFiles) {
 			 if(file2.isDirectory()){
				digui(file2);
			  }else{
				  System.out.println("文件名:"+file2.getName()+"\t"+"大小："+file2.length());
			  }
		}

    }
   
  }
