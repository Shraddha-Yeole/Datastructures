/*Given an integer array, find three numbers whose product is maximum and output the maximum product.*/

public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int result=1;
        int i=nums.length;
        System.out.println(i);
        for(int j=nums.length-1;j>=nums.length-3;j--)
        {
            result=result*nums[j];
            System.out.println(result);
        }
        return result;
        
    }
}
