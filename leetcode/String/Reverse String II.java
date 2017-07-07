/*Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
Anw : 83 ms*/

public class Solution {
    public String reverseStr(String s, int k) {
        
        char[] result=s.toCharArray();
        //System.out.println(result);
        for(int i=0;i<result.length;i++)
        {
            int j=i;
            while(j < (result.length-1) && j<(i+k-1) )
            {
                j++;
            }
           
            if(i !=(result.length-1))
            {
                reverse(result,i,j);
                System.out.println(result);
            }
             i = i + (2 * k)-1;
            //System.out.println(i);
        }
       return new String(result);
    }
    
    private void reverse(char[] result, int i, int j)
    {
        
        while(i<j)
        {
        char temp;
        temp=result[i];
        result[i++]=result[j];
        result[j--]=temp;
        }
    }
}


/*Recommended solution
public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}

*/
