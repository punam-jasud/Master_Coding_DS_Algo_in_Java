package Array;

public class LongestWord {

	public static void main(String[] args) {
		
		String str = "fun&!! and time" ;
		String words[] = str.split("[^A-Za-z0-9]");
		
		int maxIndex = 0;
		for(int i = 0 ; i < words.length ; i++)
		{
			if(words[i].length() > words[maxIndex].length())
			{
				maxIndex = i;
			}
			
		}
		System.out.println("Longest Word : " + words[maxIndex]);

	}

}
