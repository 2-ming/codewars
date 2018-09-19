package confused_package.orz;
//利用递归方法求5！;;;递归公式:f(n)=f(n-1)*n
public class Recursive {
  public static void main (String[]args) {
	  System.out.print(multi(5));
  }
  public static int multi(int n) {
	  if(n==1)
		  return 1;
	  else
	  return multi(n-1)*n ;
		}
}
