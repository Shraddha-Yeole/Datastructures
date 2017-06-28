/*
Given m arrays, and each array is sorted in ascending order. 
Now you can pick up two integers from two different arrays (each array picks one) and calculate the distance. 
We define the distance between two integers a and b to be their absolute difference |a-b|. 
Your task is to find the maximum distance
*/

public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        ArrayList<Integer> resultmax=new ArrayList<Integer>();
        ArrayList<Integer> resultmin=new ArrayList<Integer>();
        int k=0;
        
       for(List<Integer> i:arrays)
       {
               resultmax.add(i.get(i.size()-1));
               resultmin.add(i.get(0));
               Collections.sort(resultmin,Collections.reverseOrder());
       }
                      System.out.println("Min number from all array="+Collections.min(resultmin));
                      System.out.println("Max number from all array="+Collections.max(resultmax));
                      int a= Collections.min(resultmin);
                      int b= Collections.max(resultmax);
                      for(List<Integer> j:arrays)
                      {
                          
                      if(j.contains(a) && j.contains(b)){
                          return 0;
                      }
                    }
        return (b-a);
                      
    }
}
