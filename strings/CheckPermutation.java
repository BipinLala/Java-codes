package strings;

public class CheckPermutation {
	
	static String s = "";
	static boolean isPermutation(String input1, String input2)
	{
		
		
		if(input1.length() != input2.length())
		{
			return false;
		}
		
		else
		{
			for(int i=0; i<input1.length();i++)
			{
				for(int j=0; j<input1.length();j++)
				{
					if(input1.charAt(i) == input2.charAt(j))
					{
						s = s + input1.charAt(i);
						break;
					}
				}
			}
		}
		
		if(input1.equals(s)) 
		{
			return true;
		}
		
		else 
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="fxstvf";
		String str2 ="fxstvf";
		System.out.println(isPermutation(str1, str2));
		System.out.println(s);

	}

}
