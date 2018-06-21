package thinking.ten;

import thinking.ten.Fly.Pig;

public class InterfaceInner20 {
	public static void main(String[] args) {
		Fly.Pig.print();
		Pig p=new Pig();
		Fly.Bird.use(p);
		Fly.Bird.use(new Pig());
	}
	public static void main2(String[] args) {
		Pig p=new Pig();
		p.canFly();
		p.print();
	}
}
interface Fly{
	void canFly();
	static class Bird {
		static void use(Fly fly){
			fly.canFly();
		}
	}
	class Pig implements Fly{
		@Override
		public void canFly(){
			System.out.println("pig can fly");
		}
		static void print(){
			System.out.println("pig");
		}
	}
}