


   // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i< arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        System.out.println( ((sum - max) + " " + (sum - min)));
    
    }
