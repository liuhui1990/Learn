package chapter17Enum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//定义一个泛型类，使用extends关键字限制该泛型类的类型为list接口，并分别创建两个泛型对象
public class Que2<T extends List> {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Que2<ArrayList> q1=new Que2<ArrayList>();
		Que2<LinkedList> q2=new Que2<LinkedList>();
	}
	
	
}
