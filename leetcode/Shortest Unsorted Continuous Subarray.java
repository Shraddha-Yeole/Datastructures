/* 581. Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
Note:
Then length of the input array is in range [1, 10,000].
The input array may contain duplicates, so ascending order here means <=.
*/

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
         int max = nums[0], min = nums[nums.length-1];
         int j = 0, l = nums.length-1;  
        
         for (int i = 1; i < nums.length; i++) {
             if (max > nums[i]) {
                 j = i;
             } else {
                 max = nums[i];
             }
             
             if (nums[nums.length-1-i] > min) {
                 l = nums.length-1-i;                 
             } else {
                 min = nums[nums.length-1-i];
             }
         }
        if (j-l <= 0) {
            return 0;
        } 
        
        return j-l+1;
    }
}


/* Time complexity : O(n)O(n). Stack of size nn is filled.
Space complexity : O(n)O(n). Stack size grows upto nn.
*/ 


public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack < Integer > stack = new Stack < Integer > ();
        int l = nums.length, r = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
                l = Math.min(l, stack.pop());
            stack.push(i);
        }
        stack.clear();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i])
                r = Math.max(r, stack.pop());
            stack.push(i);
        }
        return r - l > 0 ? r - l + 1 : 0;
    }
}
