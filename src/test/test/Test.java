package test;

import java.util.Arrays;
import java.util.List;

public class Test {
	static void m1(List<String> l){

	}
	public static void main(String[] args) {
		String[] sa={"hh","kk","tt"};
		List<String> a=Arrays.asList(sa);
		m1(a);
		new s().p();
		String s1="select * from gd where and gdid=";
		String s2=s1.replace("where and", "where");
		//System.out.println(s2);
		String str="TestClass [name=建设银行, radio=20]";
		String name=str.substring(str.indexOf("e=")+2,str.indexOf(","));
		String ratio=str.substring(str.indexOf("o=")+2,str.indexOf("]"));
		System.out.println(name+ratio);
		I1 aa=new C1();
	}

}
interface I1{
	void run();
}
class C1 implements I1{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public void walk(){
		
	}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                	return new int[]{1,2};
                }
            }
        }
        return arr;
    }
}
class f{
	void p(){};
}
class s extends f{
	@Override
	void p(){
		System.out.println("ss");
	};
}