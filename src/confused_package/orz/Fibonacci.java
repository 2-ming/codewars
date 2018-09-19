package confused_package.orz;

public class Fibonacci {
	public static void main(String [] args) {
		int n =6;
		System.out.println("第"+n+"个月兔子的总数为"+fibonacci(n));
	}
    private static int fibonacci(int n) {
    	if (n==1 || n==2)
    		return 1;
    	else 
    		return fibonacci(n-1)+fibonacci(n-2);
    	
    }
}
