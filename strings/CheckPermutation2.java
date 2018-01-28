package strings;

import java.util.Arrays;

public class CheckPermutation2 {
	
	static boolean isPermutation(String input1, String input2)
	{
		
		
		if(input1.length() != input2.length())
		{
			return false;
		}
		
		else
		{
			char in1[] = input1.toCharArray();
			char in2[] = input2.toCharArray();
			
			Arrays.sort(in1);
			Arrays.sort(in2);
			
			input1 = new String(in1);
			input2 = new String(in2);
			
		}
		
		if(input1.equals(input2)) 
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
	


	}

}
