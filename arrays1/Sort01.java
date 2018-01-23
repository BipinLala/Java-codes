package arrays1;

import java.util.Scanner;

public class Sort01 {
	
	static void sortBinaryArray(int[] arr)
	
	{

		int a=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				a++;
			}
	
						
		}
		for(int j = 0; j < a; j++)
		{
			arr[j] = 0;
		}
		for(int z=a; z<arr.length; z++)
		{
			arr[z] = 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int arr1[] = {0,1,0,1,1,1,0,1,0,1,0};
		
		sortBinaryArray(arr1);
		for(int z=0; z<arr1.length;z++)
			System.out.print(arr1[z]);


	}

}
