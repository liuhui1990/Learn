package chapter15_IO;

import java.io.*;

import javax.swing.*;

public class Que1 {
	public static void main(String[] temp) throws IOException {
		File file =new File("word.txt");
		if(file.exists()){
			FileOutputStream out=new FileOutputStream(file);
			byte buy[]="我有一只小毛驴，我从来也不骑，有一天我突然想到骑它去赶集，就向窗外的麻雀，在电线杆上多嘴".getBytes();
			out.write(buy);
			out.close();
		}else{
			try {
				file.createNewFile();
				System.out.println("文件已创建");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FileOutputStream out=new FileOutputStream(file);
			byte buy[]="我有一只小毛驴，我从来也不骑，有一天我突然想到骑它去赶集，就向窗外的麻雀，在电线杆上多嘴".getBytes();
			out.write(buy);
			out.close();
		}
		
		byte b[] = new byte[2];
		try {
			FileInputStream re = new FileInputStream("word.txt");
			byte byt[]=new byte[1024];
			int len=re.read(byt);
			System.out.println(new String(byt,0,len));
			FileInputStream rea = new FileInputStream("word.txt");
			ProgressMonitorInputStream in = new ProgressMonitorInputStream(
					null, "读取文件", rea);
			while (in.read(b) != -1) {
				String s = new String(b);
				System.out.print(s);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
