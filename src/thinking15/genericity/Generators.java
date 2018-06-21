package thinking15.genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import tools.generator.BasicGenerator;
import tools.pets.Pet;

public class Generators {
	private static Class type;
	public <T> Generators(Class<T> type){
		this.type=type;
	}
	public static <T> Collection<T> fill(Collection<T> coll,tools.generator.Generator<T> gen,int n) {
		for(int i=0;i<n;i++){
			coll.add(gen.next());
		}
		return coll;
	}
	public static <T> List<T> fill(List<T> coll,tools.generator.Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			coll.add(gen.next());
		}
		return coll;
	}
	public static <T> ArrayList<T> fill(ArrayList<T> coll,tools.generator.Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			coll.add(gen.next());
		}
		return coll;
	}
	public static <T> Set<T> fill(Set<T> coll,tools.generator.Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			coll.add(gen.next());
		}
		return coll;
	}
	public static <T> Queue<T> fill(Queue<T> coll,tools.generator.Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String[] args) {
		List<Pet> a=Pet.petsList(7);
		fill(a,BasicGenerator.create(Pet.class),8);
		System.out.println(a);
	}
}
