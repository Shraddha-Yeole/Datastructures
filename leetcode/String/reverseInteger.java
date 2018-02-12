/* 7. Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

/* Solution approach: To check overflow condition take result variable of type long  and check result > Integer.MAX_VALUE*/

class Solution {
    public int reverse(int x) {
        
        long anw = 0;
        
       while( Math.abs(x) > 0){
           anw = anw * 10;
           anw = anw + (x % 10);
           System.out.println("anw"+anw);
           x = x/10;
           System.out.println("x"+x);
        }
         
        if ( anw >= Integer.MAX_VALUE ||  anw <= Integer.MIN_VALUE) return 0;
      
        
        int result = (int) anw;
        return result;
    }
}
