package recursion;

public class AllIndexes {
	
	public static int[] allIndicesUsingIndex(int input[], int x, int i)
	{
		if(i == input.length)
		{
			int ans[] = {};
			return ans;
		}
		
		int smallans[] = allIndicesUsingIndex(input, x, i+1);
		
		if(input[i] != x)
		{
			return smallans;
		}
		
		
			int ans[] = new int[smallans.length+1];
			ans[0] = i;
			for(int j=1; j<ans.length; j++)
			{
				ans[j] = smallans[j-1];
			}
			
			return ans;
			
	}
	
	public static int[] allIndexes(int input[], int x)
	{
		return allIndicesUsingIndex(input, x, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,2,3,5,5,4,5,6,7,5,8,5,4,9,10,5};
		
		int printarr[] = allIndexes(arr1, 5);
		for(int k=0; k<printarr.length; k++)
			System.out.println(printarr[k]);


	}

}
