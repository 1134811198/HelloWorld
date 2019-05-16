package day25;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8888);
		Socket socket=ss.accept();
		InputStream inputStream=socket.getInputStream();
		byte [] b=new byte[1024];
		int len;
		while((len=inputStream.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}
		OutputStream outputstream=socket.getOutputStream();
	outputstream.write("二组李月姣".getBytes());
	socket.shutdownOutput();
	outputstream.close();
	inputStream.close();
	socket.close();
	ss.close();
	}

}
