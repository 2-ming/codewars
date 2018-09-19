package confused_package.orz;
//从键盘输入一个数字a，然后求s=a+aa+aaa+a...aaa的值，几个数相加由键盘控制
import java.util.*;
public class Aaa {
	public static void main (String[]args) {
		System.out.println("请输入a的值以及几个数相加：");
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int n=scan.nextInt();
		scan.close();
		System.out.println(together(a,n));
	}
	public static long together(int a,int n) {
		long s=0;
		String[]array_string=new String[n];
		for(int i=0;i<n;i++) {
			String str="";
			for(int j=0;j<i+1;j++) {
				str+=String.valueOf(a);
			}
			array_string[i]=str;
		}
		for(String num:array_string) {
//			System.out.println(num);
			s+=Integer.parseInt(num);
		}
		return s;
	}

}
