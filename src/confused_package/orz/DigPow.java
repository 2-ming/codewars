package confused_package.orz;

public class DigPow {
	public static long digPow(int n, int p) {
		String s=n+"";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int num=Integer.parseInt(String.valueOf(s.charAt(i)));
			sum+=Math.pow(num, p);
			p++;
		}
		if(sum%n!=0)
           return -1;
		else {
			return (sum/n);
		}
	}
	public static void main(String[]args) {
		System.out.println(digPow(46288, 3));
	}

}
