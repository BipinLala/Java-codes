package recursion1b;

public class ReplacePi 
{
	static String replace(String input)
	{
		
		if(input.length() < 2)
			return input;
		
		String smallAns = replace(input.substring(2));
		
		if(input.substring(0, 2).equals("pi"))
		{
			return ("3.14" + smallAns);
		}
		
		else 
			return input.charAt(0) + replace(input.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(replace("pikpipijhpi"));

	}

}
