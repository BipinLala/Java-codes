package arrays2B;

import java.util.Scanner;

public class PushZeroes2 
{
	static void pushZerosAtEnd(int[] arr)
	{
		int a = 0;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == 0)
			{
				a++;
				for(int j=i; j<arr.length-1; j++)
				{
					arr[j] = arr[j+1];
				}
			}
		}
		
		for(int k=0; k<a; k++)
		{
			arr[arr.length-k-1] = 0;
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
