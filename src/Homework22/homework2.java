package Homework22;

import java.io.File;

/**
 * ������main�����д��������������̡߳�
��һ���߳�ͳ��ָ��Ŀ¼�µ��ļ���������ռ�ܿռ�������ӡ�����
��һ���̴߳�ӡ�����Ŀ¼��ÿ���ļ���Ϣ���ļ����ƺʹ�С��
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
			 System.out.println("�ļ������ǣ�"+i+","+"��ռ�ռ䣺"+lo);
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
		}System.out.println("�ļ����ǣ�"+subfile.getName()+","+"��ռ�ռ䣺"+lo);
	}
}
	}
	

