package arrays2B;

import java.util.Scanner;

public class Largest2nd {
	
	static int secondLargestElement(int[] arr)
	{
		int pos=0, max= arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max= arr[i];
				pos = i;
			}
		}
		int temp = arr[pos];
		arr[pos] = 0;
		max= arr[0];
		
		for(int j=1; j<arr.length; j++)
		{
			if(arr[j] == temp)
			{
				arr[j] = 0;
			}
			if(arr[j] > max)
			{
				max= arr[j];
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11,8,12,15,1,6,1,4,6,21,1,2,4,21,5,12,14,16,18};
		
		System.out.println(secondLargestElement(arr));
	}

}
