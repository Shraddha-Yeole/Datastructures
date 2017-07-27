/* 611. Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

Example 1:
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Note:
The length of the given array won't exceed 1000.
The integers in the given array are in the range of [0, 1000]. */

public class Solution {
    public int triangleNumber(int[] nums) {
        
        int i=0;
        int count=0;
        
        while(i<=nums.length-3){
            
            for(int j=i+1; j<nums.length-1;j++){
            
                if(nums[i]>0 && nums[j]>0 && nums[j+1]>0)
                {
                    
                    if((nums[i]+nums[j]) > nums[j+1]){
                
                System.out.println("for i"+i);
                System.out.println("for j"+j);
                System.out.println("sum"+(nums[i]+nums[j]));
                count++;
                System.out.println(count);
                
            }
                    
                }
        }
         i++;   
    }
        
        return count;
        
    }
}
