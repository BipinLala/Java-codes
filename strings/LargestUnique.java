package strings;

public class LargestUnique {
	
	static String largestUnique(String s)
	{
		String max_string = "", curr_string = "";
		int max_size = 0;
		
		for(int i =0 ; i < s.length(); i++)
		{
			curr_string = "";
			curr_string += s.charAt(i);
			
			for(int j = i+1; j < s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					break;
				}
				
				else
				{
					curr_string += s.charAt(j);
				}
				
				if(max_size <= curr_string.length())
				{
					max_size = curr_string.length();
					max_string = curr_string;
				}
			}
		}
		
		return max_string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abcdabceb";
		System.out.println(largestUnique(input));
		
	}

}
