public class Basics_String{
	
	public static void main(String[] args)
	{
		/*Create String object*/
		
		//1. String Literal
		String name="Shraddha";
		System.out.println(name);
		
		//2. new Keyword
		String surname=new String("Yeole");
		System.out.println(surname);
		
		//3. Converting char array to string
		char[] ch={'p','i','c','t'};
		String college_name=new String(ch);
		System.out.println(college_name);
		
		/* String Comparison*/
		
		//1. by equals() method : content matching. Used in authentication
		
		String s1="Hello";
		String s2="Hello";
		String s3="hello";
		String s4=new String("Hello");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//2. by == operator  compares references
		
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		
		//3.  by compareTo method Used in sorting. returns integer value if string is less,greater then second string
		
		/* positive value: difference of character value*/
		String s5="flag";
		String s6="hemalo";
		
		System.out.println(s3.compareTo(s5)); //f g h h 2 times greater than f
		System.out.println(s1.compareTo(s6));
		System.out.println(s1.compareToIgnoreCase(s3));
		
		/* String Concatenation */
		
		//1. by + operator
		System.out.println(s1 + s6);
		
		//2. by concat() method
		String result=s1.concat(s5);
		System.out.println(result);
		
		/* Substring endindex: exclusive*/
		
		System.out.println(result.substring(2));
		System.out.println(result.substring(2, 5));
		
		/* Methods of String class */
		
		//1. charAt()
		char c=s2.charAt(3);
		System.out.println(c);

		//2.contains()
		System.out.println(s2.contains("ll"));
		
		//3.
		
		
	}
	
	
}

