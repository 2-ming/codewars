package confused_package.orz;
//输入一行字符，分别统计其中中英文字母、空格、数字、和其他字符个数
import java.util.*;
public class Char_count {
	public static void main(String[]args) {
		System.out.println("请输入一行字符：");
		Scanner scan =new Scanner(System.in);
		String str =scan.nextLine();
		scan.close();
		count(str);
	}
	public static void count(String str) {
		String hanzi="[\u4e00-\u9fa5]";//汉字
        String zimu ="[a-zA-Z]";
        String shuzi="[0-9]";
        String kongge="\\s";
        int countChinese=0;
        int countLetter=0;
        int countNumber=0;
        int countSpace=0;
        int countOther=0;
        char[] array_char=str.toCharArray();//将字符串转化为字符数组
        String[]array_string=new String[array_char.length];//汉字只能作为字符串处理
        for(int i=0;i<array_char.length;i++) {
//        	System.out.println(array_char[i]);
        	array_string[i]=String.valueOf(array_char[i]);
        }
        for (String s:array_string) {
        	if(s.matches(hanzi))
        		countChinese++;
        	else if(s.matches(zimu))
        		countLetter++;
        	else if(s.matches(shuzi))
        		countNumber++;
        	else if(s.matches(kongge))
        		countSpace++;
        	else
        		countOther++;     
        }
        System.out.println("输入的汉字个数："+countChinese);
        System.out.println("输入的字母个数："+countLetter);
        System.out.println("输入的数字个数："+countNumber);
        System.out.println("输入的空格个数："+countSpace);
        System.out.println("输入的其他字符个数："+countOther);
	}

}
