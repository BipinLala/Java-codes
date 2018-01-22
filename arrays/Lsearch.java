package arrays;

import java.util.Scanner;

public class Lsearch {
	
	static int linearSearch(int[] arr, int num)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(num == arr[i])
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11};
		
		System.out.println(linearSearch(arr, 6));


	}

}
