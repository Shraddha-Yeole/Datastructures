/* Given a array of n strings, find the longest common prefix among all strings present in the array.

Input:
The first line of the input contains an integer T which denotes the number of test cases to follow. Each test case contains an integer n. Next line has space separated n strings. 

Output:
Print the longest common prefix as a string in the given array. If no such prefix exists print "-1"(without quotes).

Constraints:
1<=T<=200
1<=n<=100
1<=|S|<=100

Example:
Input:
2
4
geeksforgeeks geeks geek geezer
3
apple ape april

Output:
gee
ap
*/

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the test cases");
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			
		
		System.out.println("How many elements");
		int n = sc.nextInt();
		System.out.println("----------");
		String[] input2 = new String[n];

		System.out.println("Enter the elements");
		for(int j=0;j<input2.length;j++){
			System.out.println(j);
			input2[j] = sc.next();
		}

		for(int k=0;k<input2.length;k++){
			//System.out.println(input2[k]);
		}

		System.out.println("final output"+longestprefix(input2));

		}
	}
	
	
	public static String longestprefix(String[] input2){
		String first = input2[0];
		int l = first.length();
		String result ="";

		for(int s=1;s<input2.length;s++){
			int m=0;
			StringBuilder sb = new StringBuilder();
			while(m<l && m< input2[s].length()){

				if (first.charAt(m) == input2[s].charAt(m)){
					//System.out.print(first.charAt(m));
					//System.out.print(input2[s].charAt(m));
					sb.append(first.charAt(m));
					result = sb.toString();
					System.out.println(result);
					m++;
				}
				else break;
				//System.out.println(result);
			}

			//result = sb.toString();
			//System.out.println(sb.toString());

		}


		return result;


	}
}
