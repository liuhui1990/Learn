package thinking.ten;

import thinking.ten.Outer.Inner;

public class InnerClass {
	public static void main(String[] args) {
		Inner c=new Outer().getI();
	}
}
class Outer{
	class Inner{

	}
	public Inner getI(){
		return new Inner();
	}
}