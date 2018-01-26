package arrays2B;

import java.util.Scanner;

public class PushZeroes {
	
	static void pushZerosAtEnd(int[] arr)
	{
		int a = 0, temp, b=1;
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] == 0)
			{
				a++;
			}
		}
		
		for(int j=0; j<arr.length - a; j++)
		{
			if(arr[j] == 0)
			{
				temp = arr[j];
				arr[j] = arr[arr.length-b];	 
				arr[arr.length-b] = temp;
				b++;
			}
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
