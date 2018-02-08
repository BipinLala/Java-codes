package recursion1a;

public class SumOfDigits 
{
	static int sumOfDigits(int input) 
	{
		if(input == 0)
			return 0;
		
		int ans = sumOfDigits(input/10);
		
		return ans+input%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfDigits(123450));
	}

}
