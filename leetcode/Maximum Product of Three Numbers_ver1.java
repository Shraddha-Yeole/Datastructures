/* 628. Given an integer array, find three numbers whose product is maximum and output the maximum product.
Example 1:
Input: [1,2,3]
Output: 6
Example 2:
Input: [1,2,3,4]
Output: 24
*/

/* Time complexity : O\big(nlog(n)\big)O(nlog(n)). Sorting the numsnums array takes nlog(n)nlog(n) time.
Space complexity : O(log(n)))O(log(n))). Sorting takes O(logn) space. */


public class Solution {
    public int maximumProduct(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max((nums[n-1]*nums[0]*nums[1]),(nums[n-2]*nums[n-3]*nums[n-1]));
}
}

/* Recommended solution: Time complexity : O(n)O(n). Only one iteration over the numsnums array of length nn is required.

Space complexity : O(1)O(1). Constant extra space is used. */

public class Solution {
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {     // n lies between min1 and min2
                min2 = n;
            }
            if (n >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {     // n lies betweeen max1 and max2
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {     // n lies betwen max2 and max3
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
