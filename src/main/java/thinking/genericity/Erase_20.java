package thinking.genericity;

public class Erase_20 {
	public <T extends DoubleMe> void em(DoubleMe dm){
		//T t=dm;
		//t.s1();
	}
}
class Way1{
	public void m1(DoubleMe dm){
		dm.s1();
		dm.s2();
	}
}
interface DoubleMe{
	void s1();
	void s2();
}
class C1 implements DoubleMe{
	@Override
	public void s1() {
		// TODO Auto-generated method stub
	}
	@Override
	public void s2() {
		// TODO Auto-generated method stub
	}
	public void local(){}
}