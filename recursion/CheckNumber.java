package recursion;

public class CheckNumber 
{
	
	static boolean checkNumberWithIndex(int input1[], int x1, int i)
	{
		if(i == input1.length)
		{
			return false;
		}
		
		if(input1[i] == x1)
			return true;
		
		boolean ans = checkNumberWithIndex(input1, x1, i+1);
				return ans;
		
	}
	static boolean checkNumber(int input[], int x)
	{
		boolean finalans = checkNumberWithIndex(input, x, 0);
		return finalans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(checkNumber(arr1, 11));

	}

}
