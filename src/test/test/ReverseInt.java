package test;

public class ReverseInt {
	public static void main(String[] args) {
		System.out.println(reverse(-12345));
	}
	public static int reverse(int a){
		String s=Integer.toString(a);
		String res="";
		if(a>=0){
			for(int i=0;i<s.length();i++){
				res=s.substring(i,i+1)+res;
			}
			return Integer.parseInt(res);
		}else{
			s=s.substring(1);
			for(int i=0;i<s.length();i++){
				res=s.substring(i,i+1)+res;
			}
			res="-"+res;
			return Integer.parseInt(res);
		}
	}
}
