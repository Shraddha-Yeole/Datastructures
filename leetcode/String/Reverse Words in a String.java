/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
*/


public class Solution {
    public String reverseWords(String s) {
        
     
        char[] result=s.toCharArray();

       for(int i=0;i<result.length;i++)
       {
           if(result[i]!= ' ')
            {
                int j = i;
                while(j+1<result.length && result[j+1]!=' ')
                {
                    j++;
                }
               
               reverse(result,i,j);
                i=j;
            }
            
       }
    return new String(result);
}
        
       private void reverse(char[] result,int i,int j)
       {
           char temp;
           for(;i<j;i++,j--)
           {
               
           temp=result[i];
           result[i]=result[j];
           result[j]=temp;
            }
       }
        
      
}
