 /*有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
    凡报到3的人退出圈子，问最后留下的是原来第几号的那位
 */
package confused_package.orz;
public class Circle_3 {
	public static int location(int n) {
		//创建一个有n个数的数组
		int [] a=new int[n];
		for(int i=1;i<=n;i++) {
			a[i-1]=i;	
		}
		//出圈一个，长度减一
		int len =n;
		//i用来表示数组索引，j用来表示报的数字
		int i=0;
		int j=1;
		while(len>1) {
			if(a[i%n]>0) {
				if(j%3==0) {
					a[i%n]=0;//报3的人退圈，将编号设置为0，不能继续报数
					i++;
					j=1;//下一个人，继续从1报数
					len--;
				}
				else {
					i++;
					j++;
				}
		}
			else {
				i++;//退圈的不再报数
			}			
		}
		/*for(int num :a) {
			System.out.print(num+" ");
		}*/
		int num=0;
		for(int element :a)//遍历数组，寻找最后一个人的编号
			{
			if (element!=0) {
				num=element;
			}
		}	

		return num;	
	}
	public static void main(String[]args) {
		System.out.println(location(5));
	}

}
