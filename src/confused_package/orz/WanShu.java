package confused_package.orz;
//一个数如果恰好等于它的因子之和，这个数就称为“完数”，例如：6=1+2+3；找出10000以内的完数。
public class WanShu {
	public static void main(String[]args) {
		int n =10000;
		compNumber(n);
	}
    public static void compNumber(int n) {
    	for(int i=1;i<n;i++) {
    		int num=0;
    		for(int j=1;j<i+1;j++) {
    			if(i%j==0&&i!=j) {
    				num+=j;
    			}
    	}
    		if (i==num) {
        		System.out.println(num+" ");	
    		}
    	}
    }
}
