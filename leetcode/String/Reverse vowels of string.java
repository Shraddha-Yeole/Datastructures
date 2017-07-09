/* 345 Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y". */

public class Solution {
    public String reverseVowels(String s) {
        
        int i=0;
        int j=s.length()-1;
        String vowel="aeiouAEIOU";
        char[] result=s.toCharArray();
        
      while(i<j)
      {
          while( i<j && !vowel.contains(result[i]+""))
          {
              i++;
          }
          while( i<j && !vowel.contains(result[j]+""))
          {
              j--;
          }
      
        
        char temp=result[i];
        result[i]=result[j];
        result[j]=temp;
        
        i++;
        j--;
      }
        
        return new String(result);
    }
}
