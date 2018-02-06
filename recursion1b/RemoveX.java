package recursion1b;

public class RemoveX 
{
	static String removeX(String input)
	{
		if(input.length() == 0)
			return "";
		
		String smallAns = removeX(input.substring(1));
		
		if(input.charAt(0) == 'x')
			return smallAns;
		
		else
			return input.charAt(0) + smallAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeX("xabxxdecx"));
		
		

	}

}
