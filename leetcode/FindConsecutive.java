public class FindConsecutive{
	
	public static void main(String args[])
	{
		int[] nums={1,1,0,1,1,1,1,1};
		
		 int count=1;
	        int j=0;
	    	 int[] result=new int[3];
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]==1)
	            {
	               
	                result[j]=count++;
	                
	            }
	            else{
	                
	                 count=1;
	                 j++;
	                continue;
	               
	            }
	        }
	        
	        for(int k:result){
	      	  System.out.println(k);     
	        }
	       
		
		
		
		
		
	}
}
