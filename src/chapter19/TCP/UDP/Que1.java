package chapter19.TCP.UDP;

import java.net.*;

//获得指定端口的主机名，主机地址和本机地址
public class Que1 {
	static InetAddress ip;
	public static void main(String[] args) {
		try {
			InetAddress ip2=InetAddress.getByName("8002");
			ip=InetAddress.getLocalHost();
			String localName=ip.getHostName();
			String localIp=ip.getHostAddress();
			System.out.println("本机名："+localName);
			System.out.println("本机地址："+localIp);
			String portName=ip2.getHostName();
			String portAddress=ip2.getHostAddress();
			System.out.println("端口名："+portName);
			System.out.println("端口地址:"+portAddress);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
