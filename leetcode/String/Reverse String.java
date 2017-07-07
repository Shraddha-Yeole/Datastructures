/*344. Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".*/

public class Solution {
    public String reverseString(String s) {
        
        char[] result=s.toCharArray();
        int j=0;
        if(s.length()<=1 || s.isEmpty())
        {
            return s;
        }
        while(j<(result.length-1))
        {
            j++;
        }
        int i=0;
        while(i<j)
        {
            char temp=result[i];
            result[i++]=result[j];
            result[j--]=temp;
        }
        return String.valueOf(result);
    }
    
}
