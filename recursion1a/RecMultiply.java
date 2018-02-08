package recursion1a;

public class RecMultiply {
	
	static int multiplyTwoIntegers(int m, int n)
	{
		if(n == 0)
			return 0;
		
		int ans = multiplyTwoIntegers(m, n-1);
		
		return m + ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiplyTwoIntegers(5, 6));
		
		

	}

}
