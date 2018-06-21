package thinking15.genericity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import tools.generator.Generator;

public class Ocean_18 {
	public static void eat(BigFish bf,LittleFish lf){
		System.out.println(bf+" eats "+lf);
	}
	public static void main(String[] args) {
		List<BigFish> bflist=new ArrayList<BigFish>();
		Generators.fill(bflist, BigFish.generator(), 13);
		List<LittleFish> lfColl=new LinkedList<LittleFish>();
		Generators.fill(lfColl, LittleFish.generator, 23);
		for(BigFish bf:bflist){
			eat(bf,lfColl.get(new Random().nextInt(lfColl.size())));
		}
	}
}
class BigFish{
	private static int counter=1;
	private final int id=counter++;
	private BigFish(){}
	@Override
	public String toString(){
		return "BigFish "+id;
	}
	public static Generator<BigFish> generator(){
		return new Generator<BigFish>(){
			@Override
			public BigFish next() {
				return new BigFish();
			}
		};
	}
}
class LittleFish{
	private static int counter=1;
	private final int id=counter++;
	private LittleFish(){}
	@Override
	public String toString(){
		return "LittleFish "+id;
	}
	public static Generator<LittleFish> generator=new Generator<LittleFish>(){
		@Override
		public LittleFish next() {
			return new LittleFish();
		}
	};
}