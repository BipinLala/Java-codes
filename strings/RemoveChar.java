package strings;

public class RemoveChar {
	
	static String removeAllOccurrencesOfChar(String input, char c)
	{
		String s="";
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i) != c)
			{
				s = s+input.charAt(i);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="aaaabbbccbbbaa";
		System.out.println(removeAllOccurrencesOfChar(str, 'b'));


	}

}
