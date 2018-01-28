package strings;

import java.util.Arrays;

public class HighOccurring 
{
	static char highestOccuringCharacter(String inputString)
	{
		int count = 1;
		char c='\0';
		int max = 0;
		char str[] = inputString.toCharArray();
		Arrays.sort(str);

		
		for(int i=0; i<inputString.length()-1; i++)
		{
			if(str[i] == str[i+1])
			{
				count++;
				if(max<count)
				{
					max = count;
					c=str[i];
				}	
			}
			
			else count = 1;
		}
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="welcometocodingninjas";
		System.out.println(highestOccuringCharacter(s));


	}

}
