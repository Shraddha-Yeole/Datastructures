/* Given an array of words and a string, we need to count all words that are present in given string.*/


public class Wordcount
{
	public static void main(String args[])
	{
		String words[] = { "welcome", "to", "geeks", "practice"};
		String str = "geekswelcomegeeks";
		int count=0;

		for(String anw:words)
		{
			if(str.contains(anw))
			{
				count++;
			}
		}

		System.out.println(count);

	}
}
