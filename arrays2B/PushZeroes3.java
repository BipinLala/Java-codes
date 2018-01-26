package arrays2B;

import java.util.Scanner;

public class PushZeroes3 {
	
	static void pushZerosAtEnd(int[] arr)
	{
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != 0)
			{
				arr[count++] = arr[i];
			}
		}
		
		for(int j=count; j<arr.length; j++)
		{
			arr[j] = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2,0, 7,0,0, 9, 4,0, 6,0, 11};
		
		pushZerosAtEnd(arr);
		for(int k=0; k<arr.length; k++)
			System.out.print(arr[k]+" "); 


	}

}
