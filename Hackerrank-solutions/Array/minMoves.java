/* Find Minimum Number Of Swap Required To Sort Input Array

Given an array containing sequence of bits (0 or 1), you have to sort this array in the ascending order i.e. all 0' in first part of array followed by all 1's. The constraints is that you can swap only the adjacent elements in the array. Find the minimum number of swaps required to sort the given input array.

Example: Given the array (0,0,1,0,1,0,1,1) the minimum number of swaps is 3

*/

int minMoves(int []array){
       //Boundary condition
       if(array == null || array.length == 0)
             return 0;

       int swap = 0, count = 0;
        //iterate over all the elements of given array
       for(int i = array.length; i >= 0; i--){
               if(array[i] == 0)
                    count++;            //count the number of 0s between two 1s
               else
                    swap += count;
       }
       return swap;   //return the count of required swap
}
