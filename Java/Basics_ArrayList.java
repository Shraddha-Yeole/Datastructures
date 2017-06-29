import java.util.ArrayList;
import java.util.Collections;

public class Basics_arraylist
{
	public static void main(String args[])
	{
		System.out.println("Arraylist initialization");
		
		ArrayList<Integer> arr =new ArrayList<Integer>();
		arr.add(45);
		arr.add(12);
		arr.add(46);
		
		System.out.println("Print elements of ArrayList");
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("Length of ArrayList="+arr.size());
		
		Collections.sort(arr);
		System.out.println("Arralist after sorting"+arr);
		
		System.out.println("Search element in arraylist= ");
		System.out.println(Collections.binarySearch(arr, 45));
		
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println("Arraylist descensing sorting"+arr);
		
	}
}
