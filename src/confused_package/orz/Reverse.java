package confused_package.orz;
//将一个数组逆序输出（使用折半思想，将第一个元素与最后一个元素交换，以此类推）
public class Reverse {
         public static void main(String[]args){
        	 int []A=new int [] {1,2,3,4,5,6,7,8,9};
        	 print(A);
        	 System.out.println();
        	 int []B=reverse(A);
        	 print(B);
         }
         public static int[] reverse(int []A) {
        	 for(int i=0;i<A.length/2;i++) {
        		 int temp =A[A.length-i-1];
        		 A[A.length-i-1]=A[i];
        		 A[i]=temp;
        	 }
        	 return A;
         }
         private static void print(int []A) {
        	 for(int m:A) {
        		 System.out.print(m+" ");
        	 }
         }
}
