import java.util.Scanner;

	public class stringCompression {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			 System.out.println("\n Enter 1st string");
		    String str1  = scan.next();
		    System.out.println("\n Enter 2nd string");
		    String str2  = scan.next();
		    
		  Boolean result=stringCompression(str1,str2);
	    System.out.println("REsult ="+result);
		    System.out.println(stringCompression(str1));
		}
		
		private static String stringCompression(String str1){
			int i=0, count=1;
			StringBuilder result = new StringBuilder();
			while(i< str1.length()-1){
				if(str1.charAt(i) == str1.charAt(i+1)){
					count++;
				}
				else{
					result.append(str1.charAt(i));
					result.append(count);
					count=1;
				}
				i++;
			}
			result.append(str1.charAt(i));
			result.append(count);

			return str1.length() <= result.length() ?  str1 : result.toString() ;
			
				
	}

	}
