/* 1.1 Implement an algorithm to determine if a string has all unique characters. What if you
can not use additional data structures? */

package ctci;

class uniqueCharacters{
	
	public static void main(String args[])
	{
		
		String s="abvcdfgh";
		
		boolean result= checkUnique(s);
		System.out.println(result);
	}
	
	public static boolean checkUnique(String s)
	{
		
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
		
	}
}
