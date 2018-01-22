package arrays;

import java.util.Scanner;

public class ArrayDiff {

	static int findDifference(int[] input)
	{
		int eve = 0, odd = 0;
		
		for(int i=0; i<input.length; i+=2)
		{
			eve += input[i];
		}
		
		for(int i=1; i<input.length; i+=2)
		{
			odd += input[i];
			
		}
		
		return (eve-odd);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11};
		
		System.out.println(findDifference(arr));

	}

}
