package recursion1a;

public class CountZeroes 
{
	static int countZerosRec(int input)
	{
		if(input == 0)
			return 0;
		
		int ans = countZerosRec(input/10);
		
		if(input%10 == 0)
			return ans + 1;
		else 
			return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countZerosRec(10200040));

	}

}
