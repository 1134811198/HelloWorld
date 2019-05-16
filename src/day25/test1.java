package day25;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test1 {

	public static void main(String[] args) throws Exception {
		InetAddress localHost=InetAddress.getLocalHost();
		System.out.println(localHost);
		InetAddress address=InetAddress.getByName("PC1");
		System.out.println(address);
	}

}
