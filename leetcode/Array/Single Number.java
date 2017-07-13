/* 136. Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/


public class Solution {
    public int singleNumber(int[] nums) {
        
        int result=0;
        
        Arrays.sort(nums);
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                result = nums[i];
            }
            i++;
            
            if(i==(nums.length-1))
        {
            return nums[nums.length-1];
        }
    }
        
        
        return result;
    }
}

/* recommended : bit manipulation */
