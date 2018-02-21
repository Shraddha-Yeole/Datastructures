/* Java program to find the counts of each character in a String */

package twitter;

import java.util.HashMap;
import java.util.Scanner;

public class lentghCWL {
	
	public static void main(String[] args){
		System.out.println("Enter the Input");
		Scanner sc1 = new Scanner(System.in);
		String input  = sc1.nextLine();
				System.out.println(input);
				countCWL(input);
		}
	
		
	
	public static void countCWL(String input){
		
		int value = 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0 ; i< input.length(); i++){
			char c = input.charAt(i);
			if(map.containsKey(c)){
				value = map.get(c);
				value++ ;
				map.put(c, value);
			}else{
				map.put(c, 1);
			}
		}
		
		
		for(Character key : map.keySet()){
			System.out.println("key= "+ key + "   value" + map.get(key));
		}
		
	}

}
