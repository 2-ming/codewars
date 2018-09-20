package confused_package.orz;

public class TowToOne {
	 public static String longest (String s1, String s2) {
	        String str =s1+s2;
	        for(int i=0;i<str.length();i++) {
	        	for(int j=1;j<str.length();j++) {
//	        		System.out.println(str.subSequence(i,i+1));
//	        		System.out.println(str.subSequence(j,j+1));
	        	if(str.substring(i, i+1)==str.substring(j, j+1)) {
	        		str.replace(str.substring(j,j+1),"");
	        	}
	          }
	        }
	        return str;
	    }
	 public static void main(String[]args) {
		 System.out.println(longest("Ildlayoved","dayyu"));
	 }
	}
