package confused_package.orz;
//一球从100米自由落下，每次落地后反弹回原高度的一半，在落下，问，经过第10次落地时，共经过多少米，第10次反弹有多高
public class Luoti {
         public static float height(int n) {//第n次反弹的高度
        	 float h=100;
        	 for(int i=1;i<n+1;i++) {
        		 h/=2;
        	 }
        	 return h;
         }
         public static float distance(int n) {
        	 float d=100;
        	 for (int i=1;i<n;i++) {
        		 d+=height(i)*2;
        	 }
        	 return d;
         }
         public static void main(String[]args) {
        	 int n=10;
        	 System.out.println("经过第"+n+"次落地时，共经过"+distance(n)+"米\\n第"+n+"次反弹高度为："+height(n)+"米");
         }
}
