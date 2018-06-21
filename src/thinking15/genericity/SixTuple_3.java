package thinking15.genericity;

public class SixTuple_3<A,B,C,D,E,F> {
	public final A first;
	public final B second;
	public final C third;
	public final D fourth;
	public final E fifth;
	public final F sixth;
	public SixTuple_3(A a,B b,C c,D d,E e ,F f){
		this.first=a;
		this.second=b;
		this.third=c;
		this.fourth=d;
		this.fifth=e;
		this.sixth=f;
	}
	public static void main(String[] args) {
		SixTuple_3<String,String,Integer,Double,Boolean,Character> st=new SixTuple_3("hh","gg",3,3d,true,"a");
	}

}
