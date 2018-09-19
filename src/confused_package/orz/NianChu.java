package confused_package.orz;
//求两个正整数m,n的最大公约数和最小公倍数，利用数学辗除法；
import java.util.*;
public class NianChu {
	public static void max_min(int m, int n) {
		System.out.println(m);
		System.out.println(n);
		int temp;
		int j=m*n;
	if (m<n) {
		  temp=n;
		  n=m;
		  m=temp;		
		}
	while(m%n!=0) {
		temp=m%n;
		m=n;
		n=temp;
	}
	System.out.println("最大公约数为："+n);
	System.out.println("最小公倍数为："+j/n);
	}
	public static void main(String[]args) {
		System.out.println("请输入两个正整数：");
		Scanner scan =new Scanner(System.in);
		int m =scan.nextInt();
		int n = scan.nextInt();
		scan.close();
		max_min(m,n);
	}
}
