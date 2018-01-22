package arrays;

import java.util.Scanner;

public class ArraySum {
	
	static int sum(int[] input)
	{
		int ans=0;
		for(int i=0; i < input.length;i++)
		{
			ans += input[i];
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11};
		
		System.out.println(sum(arr));

	}

}
