package recursion;

public class SumArrray 
{
	static int arrSum(int arr[], int i)
	{
		if(i == 0)
		{
			return arr[i];
		}
		
		int ans = arrSum(arr, i-1);
				return (arr[i] + ans);
	}
	
	static int sum(int input[])
	{
		return arrSum(input, input.length-1);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum(arr1));
		

	}

}
