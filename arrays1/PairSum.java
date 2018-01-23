package arrays1;

import java.util.Scanner;

public class PairSum 
{
	static void pairSum(int[] arr, int num)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] + arr[j]== num)
				{
					if(arr[i] > arr[j])
					{
						System.out.println(arr[j]+" "+arr[i]);
					}
					else
					{
						System.out.println(arr[i]+" "+arr[j]);
					}
				}
			}
		}
		

	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11};
		
		pairSum(arr,11);

		
		

	}

}
