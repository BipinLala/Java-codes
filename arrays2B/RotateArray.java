package arrays2B;

import java.util.Scanner;

public class RotateArray {
	static void rotationArray(int[] arr)
	{
		int temp = arr[0];
		
		for(int j=0; j<arr.length-1; j++)
		{
			arr[j] = arr[j+1];
		}
		arr[arr.length-1] = temp;
	}
	
	
	static void rotate(int[] arr, int d)
	{
		for(int i=0; i<d; i++)
		{
			rotationArray(arr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {1,2,3,4,5,6,7};
		
		rotate(arr, 3);
		
		for(int k=0; k<arr.length; k++)
			System.out.print(arr[k]+" "); 



	}

}
