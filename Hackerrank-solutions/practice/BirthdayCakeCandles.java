    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int max = Integer.MIN_VALUE; 
    int count = 0;
    for(int a : candles) {
        if(a > max)
           {
             max = a;
            count = 0;
            count++;  
           } 
        else if(a == max)
            {
                count++;
            }
    }
    return count;
    }
