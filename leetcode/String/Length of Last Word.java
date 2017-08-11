/* 58. Length of Last Word 
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5. */



public class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        if(s.length()==0){
            return 0;
        }
        
        int i=0;
        
        while(i<s.length()-1){
            if(s.charAt(i) != ' ' )
                count++;
            else if(s.charAt(i) == ' ' && i == s.length()-1)
                return count;
            else if(s.charAt(i) == ' ' && s.charAt(i+1) !=' ')
                count=0;
            i++;
        }
        if (s.charAt(i) != ' ')
            count++;
        return count;
        
    }
}


/* recommended solution */

public class Solution {
    public int lengthOfLastWord(String s) {
       
        int length = s.length();
        int count = 0 ;
        
        
        while(length>0 && s.charAt(length-1)==' '){
            length--;
        }
        
        while(length>0 && s.charAt(length-1)!= ' '){
            count++;
            length--;
        }
        
        return count;
}
}

