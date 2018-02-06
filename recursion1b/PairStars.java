package recursion1b;

public class PairStars 
{
	public static String addStars(String s)
	{
		if(s.length() == 1)
			return s;
		
		String smallAns = addStars(s.substring(1));
		
		if(s.charAt(0) == s.charAt(1))
		{
			return (s.charAt(0) + "*" + smallAns);
		}
		
		else 
		{
			return (s.charAt(0) + smallAns);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(addStars("aabccddaa"));

	}

}
