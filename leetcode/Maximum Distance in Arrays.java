/*
Given m arrays, and each array is sorted in ascending order. 
Now you can pick up two integers from two different arrays (each array picks one) and calculate the distance. 
We define the distance between two integers a and b to be their absolute difference |a-b|. 
Your task is to find the maximum distance
*/

public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minValueInList = arrays.get(0).get(0);
        int maxValueInList = arrays.get(0).get(arrays.get(0).size() - 1)
        
        int resultantDistance = Integer.MIN_VALUE;
        
        for(i=1; i<arrays.size(); i++)
        {
          int minValue = arrays.get(i).get(0);
          int maxvalue = arrays.get(i).get(arrays.get(i).size()-1);
          resultantDistance = Math.max(resultantDistance, Math.abs(maxValue - minValueInList));
          resultantDistance = Math.max(resultantDistance, Math.abs(minValue - maxValueInList));
          
          maxValueInList = Math.max(maxValue, maxValueInList);
          minValueInList = Math.min(minValue, maxValueInList);
          
        }
        return resultantDistance;
    }
}
