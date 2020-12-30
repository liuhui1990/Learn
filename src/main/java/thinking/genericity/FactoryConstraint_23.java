package thinking.genericity;

public class FactoryConstraint_23 {
	public static void main(String[] args) {

	}
}
interface FactoryI<T>{
	T create(int a);
}
class Foo<T>{
	private final T x;
	public <F extends FactoryI<T>> Foo (F factory,int a){
		x=factory.create(a);
	}
}
class IntegerFactory implements FactoryI<Integer>{

	@Override
	public Integer create(int a) {
		return new Integer(a);
	}
}