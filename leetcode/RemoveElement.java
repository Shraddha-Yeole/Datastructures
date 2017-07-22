/* Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2. */

/*  Time complexity : O(n). Both i and n traverse at most n steps. In this approach, the number of assignment operation is equal to the number of elements to remove. So it is more efficient if elements to remove are rare.
Space complexity : O(1)*/

public class Solution {
    public int removeElement(int[] nums, int val) {
        
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[result]=nums[i];
                result++;
            }
            
        }
        
        return result;
    }
}

/* Alternate Approach : */ 

public int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
  
