public class Basics_array{
	
	public static void main(String[] args)
	{
		System.out.println("\nArray");
		
		int[] a=new int[5];
		a[0]=10;
		System.out.println(a[0]);
		
		int[] b={10,20,30,40};
		System.out.println("\nArray_Elements");
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("\nArray_Shortcut");
		for(int j:b)
		{
			System.out.println(j);
		}
		
		System.out.println("\nSearch element in array");
		int found=30;
		int k;
		for(k=0;k<b.length;k++)
		{
			if(found==b[k])
				break;
			
		}
		System.out.println("\nelement found at index= "+k);
		
		System.out.println("Copy elements from one array to another");
		for(int f=0;f<b.length;f++)
		{
			b[f]=a[f];
			System.out.println(b[f]);
		}
		
		
		
	}
}
