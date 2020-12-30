package thinking.genericity;

import java.util.ArrayList;
import java.util.List;

public class Bouds_25 {
	static <S extends Hear> void hear(S s){
		s.canHear();
	}
	static <S extends Listen> void listen(S s){
		s.canListen();
	}
	public static void main(String[] args) {
		List<? extends Hear> men;
		Human human=new Human();
		hear(human);
		listen(human);
		List<? extends Human> humans=new ArrayList<Child>();
		Child c=new Child();
		//humans.add();
		//humans.add();
	}
}
interface Hear{
	void canHear();
}
interface Listen{
	void canListen();
}
class Human implements Hear,Listen{
	@Override
	public void canListen() {
		System.out.println("I can listen");
	}
	@Override
	public void canHear() {
		System.out.println("I can hear");
	}
}
class Child extends Human{
}