package confused_package.orz;
//打印水仙花数
public class Prog3 {
	public static void main(String[]args) {
		for(int i=100;i<1000;i++) {
			if(isLotus(i)) {
				System.out.println(i);
			}
		}
		
	}
	public static boolean isLotus(int lotus) {
		int b=lotus/100;
		int s=(lotus-b*100)/10;
		int g=lotus-b*100-s*10;
		boolean flag=false;
		if(lotus==b*b*b+s*s*s+g*g*g) {
			return !flag;
		}
		else
			return flag;
	}
}
