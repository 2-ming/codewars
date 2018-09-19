package confused_package.orz;
//有五个学生，每个学生有三门课的成绩，从键盘输入数据（包括学生号、姓名、三门课成绩），计算出平均成绩，将原有的数据和计算出的平均分数放在磁盘文件study.txt中。
//程序分析：首先利用java基本语句计算出平均成绩，然后利用Java输出流，将成绩写入磁盘的指定文件中，注意此题运行成功的前提是磁盘已经存在study.txt文件，等待输出内容。
import java.io.*;
public class Output {
       //	定义学生模型
        String [] number = new String[5];
        String [] name =new String [5];
        float [][] grade = new float [5][3];
        float [] sum =new float [5];
        public static void  main (String[]args) throws IOException {
        	Output study =new Output();
        	study.input();
        	study.output();
        }
        // 输入学号、姓名、成绩
        void input()throws IOException{
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            //录入标识状态
            boolean isRecord =true;
            while (isRecord){
            	try {
            		for(int i=0;i<5;i++) {
            			System.out.print("请输入学号：");
            			number[i]=br.readLine();
            			System.out.print("请输入姓名：");
            			name[i]=br.readLine();
            			for(int j=0;j<3;j++) {
            				System.out.print("请输入第"+(j+1)+"门课的成绩：");
            				grade[i][j]=Integer.parseInt(br.readLine());
            			}
            			System.out.println();
            			sum[i]=grade[i][0]+grade[i][1]+grade[i][2];
            		}
            		isRecord=false;	
            	}catch(NumberFormatException e) {
            		System.out.println("请输入第一个数字！");
            	}	
            }
        }
        //输出文件
       void output()throws IOException{
        	FileWriter fw =new FileWriter("C:\\Users\\1\\Desktop\\study.txt");
        	BufferedWriter bw =new BufferedWriter(fw);
        	bw.write("No."+"  Name"+"  grade1"+"  grade2"+"  grade3"+"  average");
        	bw.newLine();
        	for (int i=0;i<5;i++) {
        		bw.write(number[i]);
        		bw.write("  "+name[i]);
        		for(int j=0;j<3;j++) 
        			bw.write("  "+grade[i][j]);
        		bw.write("  "+(sum[i]/5));
        		bw.newLine();
        	}
        	bw.close();
        }
        
}
