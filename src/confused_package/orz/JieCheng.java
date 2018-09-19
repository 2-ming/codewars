package confused_package.orz;
//求1！+2！+3！+4！+....+20！的和
public class JieCheng {
	public static void main(String[]args) {
		int sum=0;
		for (int i=1;i<21;i++) {
			sum+=factorial(i);
		}
		System.out.println(sum);
	}
    public static int factorial(int n) {
    	int multi =1;
    	for(int i=1;i<n+1;i++)
    		multi*=i;
    	return multi;
    }
}
