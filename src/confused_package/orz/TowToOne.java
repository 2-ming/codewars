package confused_package.orz;

public class TowToOne {
	 public static String longest (String s1, String s2) throws StringIndexOutOfBoundsException{
	        String str =s1+s2;
	        StringBuffer sb =new StringBuffer(str);
	        for(int i=0;i<sb.length();i++) {
	        	for(int j=i+1;j<sb.length();j++) {
//	        		System.out.println(str.subSequence(i,i+1));
//	        		System.out.println(str.subSequence(j,j+1));
	        	if(sb.charAt(i)==sb.charAt(j)) {
	        		 sb.deleteCharAt(j);
	        		 j--;
//	        		 System.out.println(sb);
	        	}
	          }
	        }
	      
			return sb.toString();
}
	 public static void main(String[]args) {
		 System.out.println(longest("Ildlayoved","dayyu"));
	 }
	}
