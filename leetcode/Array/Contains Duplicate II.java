/* 219. Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
and the absolute difference between i and j is at most k.
Solution exceeds Time Limit.*/

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if(nums.length==0 && k==0)
        {
            return false;
        }
        
        for(int i=0;i<=nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    int result=Math.abs(i-j);
                    System.out.println(result);
                    if(result<=k)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

/* Recommended solution:

public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int min = Integer.MAX_VALUE;
 
    for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            int preIndex = map.get(nums[i]);
            int gap = i-preIndex;
            min = Math.min(min, gap);
        }
        map.put(nums[i], i);
    }
 
    if(min <= k){
        return true;
    }else{
        return false;
    }
}
*/
