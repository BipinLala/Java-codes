package recursion1a;

public class StringPalindrome 
{
	static boolean stringPali(String input1, int i)
	{
		if(i >= input1.length()-i-1)
		{
			return true;
		}
		
		boolean ans = stringPali(input1, i+1);
		
		if(input1.charAt(i) != input1.charAt(input1.length()-1-i))
		{
			return false;
		}
		
		if(ans == true)
		{
			if(input1.charAt(i) == input1.charAt(input1.length()-1-i))
				return true;
		}
		
		return ans;
	}
	
	static boolean isStringPalindrome(String input)
	{
		return stringPali(input, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isStringPalindrome("abcccba"));
		

	}

}
