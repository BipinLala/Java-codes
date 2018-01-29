package strings;

public class RemDupli 
{

	static String removeConsecutiveDuplicates(String input)
	{
		char c[] = { input.charAt(0)};
		String s = new String(c);
		//	s.toString(input.charAt(0));
		
		for(int i=1; i<input.length(); i++)
		{
			if(input.charAt(i) != s.charAt(s.length()-1) )
			{
				s = s + input.charAt(i);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="aaaabbbccbbbaa";
		System.out.println(removeConsecutiveDuplicates(str));


	}

}
