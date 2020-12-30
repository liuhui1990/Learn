package thinking.genericity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TypeLabel_22 {
	public static <T> void  create(Class<T> type,String s) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		try {
			Constructor<T> ctor=type.getDeclaredConstructor(int.class,String.class);
			T t=ctor.newInstance(0,s);
			System.out.println(t);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			create(Test.class,"hhh");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Test{
	int a;
	String b;
	public Test(){}
	public Test(int a,String b){
		this.a=a;
		this.b=b;
		//System.out.println("a= "+a+" b= "+b);
	}
	@Override
	public String toString(){
		return "a="+a+" b="+b;
	}
}