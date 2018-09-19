package confused_package.orz;
//将一个正整数分解质因数
public class Fenjie {
	public static void main(String[]args) {
		int n=1;
		zhiyinshu(n);
	}
    public static void zhiyinshu(int n) {
    	System.out.print(n+"=");
    	for(int i=2;i<n+1;i++) {
    		while(n%i==0&&n!=i) {
    			n/=i;
    		System.out.print(i+"*");
    		}
    		if(n==i) {
    			System.out.println(i);
    		}
    	}
    }
    
}

