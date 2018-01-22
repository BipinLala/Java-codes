package arrays;

import java.util.Scanner;

public class SwapElements {
	
	
	static void swapAlternate(int[] input)
	{
		int a;
		for(int i=0; i<input.length-2;i+=2)
		{
			a=i;
			int temp = input[a];
			input[a] = input[++a];
			a=i;
			input[++a] =temp;
		}
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11, 5};
		
		swapAlternate(arr);
		
		for(int j=0;j<arr.length;j++)
		
		System.out.print(arr[j]);

		
		

	}

}
