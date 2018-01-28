package strings;

public class MinLength {
	
	static String minLengthWord(String input)
	{
		String words[] = input.split("\\s");
		String ans ="";
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<words.length; i++)
		{
			String indiword = words[i];
			
			if(indiword.length() < min)
			{
				min = indiword.length();
				ans = indiword;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		String str ="Welcome to coding ninjas";
		System.out.println(minLengthWord(str));

		
	}

}
