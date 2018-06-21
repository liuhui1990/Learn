package thinking15.genericity;

import java.util.ArrayList;
import java.util.List;

public class Covariant_26 {
	public static void main(String[] args) {
		Number[] nums=new Integer[10];
		nums[0]=3;
		List<? extends Number> numList=new ArrayList<Integer>();
		numList.add(null);
	}
}
