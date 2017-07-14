/* 217 Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct
tm: 18 ms.*/


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
      
        if(nums.length<2)
        {
            return false;
            
        }
        
        
        for(int i=0;i<nums.length-1;i++)
        {
              
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
       
        return false;
    }
}


/* recommended solution : 
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}

*/
