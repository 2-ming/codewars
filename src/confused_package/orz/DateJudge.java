package confused_package.orz;
import java.util.*;
//输入某年某月某日，判断这一天是这一年的第几天
public class DateJudge {
        public static void main(String[]args) throws Exception{
        	@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in).useDelimiter("\\D");//匹配非数字
            System.out.println("请输入当前日期（年-月-日）：");
            	int year =scan.nextInt();
                int month =scan.nextInt();
                int day =scan.nextInt();
                scan.close();
                System.out.println("今天是"+year+"年的第"+Day(year,month,day)+"天");
        } 
        public static int Day(int year,int month,int day) {
        	int n=0;
        	int []month_date={0,31,28,31,30,31,30,31,31,30,31,30};
        	if (((year%4==0)&&(year%100==0))||(year%400==0))
        		month_date[2]=29;
        	for(int i=0;i<month;i++) {
        		n+=month_date[i];
        	}
        	n+=day;
        	return n;
        	
        }
}
