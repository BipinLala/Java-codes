package arrays;

public class Sum 
{
	
	
	static int sum(int n)
	{
		if(n == 0)
		{
			return n;
			
		}
		int s;
		s=n+sum(n-1);
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(4));

	}

}
