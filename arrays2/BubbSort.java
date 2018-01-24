package arrays2;

import java.util.Scanner;

public class BubbSort {
	
	static void bubbleSort(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int temp;
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
		arr[i] = arr.length-i;
		}
		long start = System.currentTimeMillis();
		bubbleSort(arr);
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
//		for(int k=0; k<arr.length; k++)
//			System.out.print(arr[k]+" "); 


	}

}
