package strings;

public class Replace {
	
	static String replaceCharacter(String input, char c1, char c2)
	{
		String str = "";
		for(int i = 0; i< input.length(); i++)
		{
			if(input.charAt(i)!= c1)
			{
				str += input.charAt(i);
			}
			
			else
			{
				str += c2;
			}
		}
		return str;
		
	}
	
	public static void main(String[] args) 
	{
		String s ="abccba";
		System.out.println(replaceCharacter(s, 'c', 'X'));
	}

}
