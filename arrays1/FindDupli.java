package arrays1;

import java.util.Scanner;

public class FindDupli {
	
	static int duplicate(int[] arr)
	{
		int sum=0;
		int arrsum=0;
		for(int i=0; i<arr.length-1; i++)
		{
			sum += i;
		}
		
		for(int j=0; j<arr.length; j++)
		{
			arrsum += arr[j];
		}
		
		return arrsum-sum;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 5, 1, 4, 4, 0, 3};
		
		System.out.println(duplicate(arr));


	}

}
