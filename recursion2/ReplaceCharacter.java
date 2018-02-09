package recursion2;

public class ReplaceCharacter 
{
	public static String replaceCharacter(String input, char c1, char c2)
	{
		if(input.length() == 0)
			return "";
		
		String smallAns = replaceCharacter(input.substring(1),c1,c2);
		
		if(input.charAt(0) == c1)
			return c2 + smallAns;
		
		else
			return input.charAt(0) + smallAns;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(replaceCharacter("xabxxdecx",'x','0'));


	}

}
