package thinking15.genericity;

import java.util.Iterator;

import tools.generator.Generator;

public class IterableFibonacci implements Iterable<Integer>{
	private int n;
	private final Fibonacci fi=new Fibonacci();
	public IterableFibonacci(int count){
		this.n=count;
	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){
			@Override
			public boolean hasNext(){
				return n>0;
			}

			@Override
			public Integer next() {
				n--;
				return fi.next();
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
			}

		};
	}
	public static void main(String[] args) {
		IterableFibonacci itF=new IterableFibonacci(9);
		for(int i:itF){
			System.out.print(i+" ");
		}
	}
}
class Fibonacci implements Generator<Integer>{
	private int count=0;

	@Override
	public Integer next() {
		return fib(count++);
	}
	private int fib(int num){
		if(num<2){return 1;}
		return fib(num-1)+fib(num-2);
	}
}