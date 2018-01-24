package arrays2;

import java.util.Scanner;

public class InsSort 
{
	static void insertionSort(int[] arr)
	{
		int temp , j;
		for(int i=0; i<arr.length; i++)
		{
			temp =  arr[i];
			j = i-1;
			
			while(j>=0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j--;				
			}
			
			arr[j+1] = temp;
		}
	}
	

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11};
		
		insertionSort(arr);
		for(int k=0; k<arr.length; k++)
			System.out.print(arr[k]+" "); 


	}

}
