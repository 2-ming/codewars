package confused_package.orz;
public class Classify {
	public static void grade(int n) {
		if (n>100||n<0) {
			System.out.println("输入无效");
		}
		else {
			String str=(n>90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
			System.out.println(n+str);
		}
	}
public static void main (String []args) {
	/*int n=-1;
	try {
		n=Integer.parseInt(args[0]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("请输入成绩：");
		return ;
	}*/
	grade(60);
}
}
