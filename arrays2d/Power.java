package arrays2d;

public class Power 
{
	
	static int power(int x, int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		int z = power(x, n-1);
		return x*z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(power(2,5));
	}

}
