package arrays2B;

import java.util.Scanner;

public class CheckRotation 
{
	static int arrayRotateCheck(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] > arr[i+1])
			{
				return i+1;
			}
		}
		return 0;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int arr[] = {5, 6,1,2,3,4};
		
		System.out.println(arrayRotateCheck(arr));


	}

}
