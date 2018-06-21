package chapter19.TCP.UDP;

import java.io.*;
import java.net.*;

/*创建一个在8001端口上等待的serverSocket对象，当接收到一个客户机的连接请求后，
程序从与客户及建立了连接的socket对象中获得输入输出流，通过输出流向客户机发送信息 */
public class Que2 {
	private ServerSocket server;
	private Socket socket;
	private BufferedReader reader;
	private BufferedWriter writer;
	public static void main(String[] args) {
		Que2 q2=new Que2();
		q2.getServer(8002);
		
	}
	 void getServer(int port){
		try {
			server=new ServerSocket(port);
//			server.close();
			System.out.println("服务器连接套字创建成功");
			while(!server.isClosed()){
				System.out.println("等待客户机连接");
				socket=server.accept();
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				OutputStream ops=socket.getOutputStream();
				String context="这个东西"+"真的好难"+"但是\n我就不信了";
				ops.write(context.getBytes());
				/*byte buf[]=new byte[1024];
				int len=0;*/
				
//				for(int k=0;k<context.length;k++){
//					writer.write(context[k]);
//					writer.newLine();
//				}
//				writer.close();
				
			}
			reader.close();
			writer.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		server.close();
//		try {
//			if(reader!=null){
//				reader.close();
//			}
//			if(socket!=null){
//				socket.close();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	 }
}
