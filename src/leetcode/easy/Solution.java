package leetcode.easy;

class Solution {
    public static int addDigits(int num) {
        if(num<10){
            return num;
        }
        int ret=0;
        while(num>9){
            ret+=num%10;
            num=num/10;
            if(num<=9){
                ret=num+ret;
                int res=ret%9;
                if(res==0) return 9;
                else return res;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
		System.out.println(addDigits(567));
	}
}