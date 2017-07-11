/* 283 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations. (2ms)
*/

public class Solution {
    public void moveZeroes(int[] nums) {
        
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[result]=nums[i];
                result++;
            }
            
        }
        System.out.println(result);
        while(result<nums.length)
        {
            nums[result]=0;
            result++;
        }
        
    }
}

/*Recommended 1ms
public void moveZeroes(int[] nums) {

    int j = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
        }
    }
}

*/
