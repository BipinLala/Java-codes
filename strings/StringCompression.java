package strings;

public class StringCompression {
	static String compress(String inputString)
	{
		int count = 1,i;
		String s="";
		
		for(i=0; i<inputString.length()-1; i++)
		{
			if(inputString.charAt(i) == inputString.charAt(i+1))
			{
				count ++;
			}
				
			else
			{
				if(count>1)
				{
					s = s + inputString.charAt(i) + count;
				}
				
				else
				{
					s=s+inputString.charAt(i);
				}
				
				count = 1;
			}
			
		}
		if(count>1)
		{
			s = s + inputString.charAt(i) + count;
		}
		
		else
		{
			s=s+inputString.charAt(i);
		}
		
		return s;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str ="aaaabbbcbbbaahhhggddh";
		System.out.println(compress(str));
		

	}

}
