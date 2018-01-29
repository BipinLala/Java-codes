package strings;

public class StringPalin {
	
	static boolean checkPalindrome(String str)
	{
		int i=0;
		for(i=0; i< str.length(); i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				{
				return false;
				}
			if(i == str.length()-i-1)
			{
				break;
			}
			i++;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="abccba";
		System.out.println(checkPalindrome(s));

	}

}
