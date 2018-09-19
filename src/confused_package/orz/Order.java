package confused_package.orz;

public class Order {
		  public static String order(String words) {
			  String[] s1= words.split("\\s+");
			  String[] s2=new String[s1.length];
			  String ss="";
			  if (words.length()==0)
			     return ss;
			  else {
				  for(int i=1;i<=s1.length;i++) {
					  for(String word:s1) {
						  if(word.indexOf(i+"")>=0) {
							  s2[i-1]=word;
							  ss=ss+s2[i-1]+" ";
							  
						  }
					  }
				  }    
			  }
			 ss=ss.trim();
			 return ss;
		  }
		  public static void main(String[]args) {
				System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
			}
}

