package recursion1b;

public class StringToInteger 
{
	public static int convertStringToInt(String input)
	{
		if(input.length() == 0)
		{
			return 0;
		}
		
		int smallAns = convertStringToInt(input.substring(0, input.length()-1));
		
		int ans = smallAns*10 + (input.charAt(input.length()-1) - '0');
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convertStringToInt("1234560"));

	}

}
