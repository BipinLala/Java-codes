package arrays1;

import java.util.Scanner;

public class FindSame {
	
	static void intersection(int[] arr1, int[] arr2)
	{
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6};
		int arr3[] = {7, 6,9, 5, 4, 1, 5};
		
		intersection(arr,arr3);


	}

}
