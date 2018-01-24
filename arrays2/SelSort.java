package arrays2;

import java.util.Scanner;

public class SelSort 
{
	static void selectionSort(int[] arr)
	{
		int pos = 0, temp, small;
		for(int i=0; i<arr.length-1; i++)
		{
			small = arr[i];
			pos = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(small > arr[j])
				{
					small = arr[j];
					pos = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11};
		
		selectionSort(arr);
		for(int k=0; k<arr.length; k++)
			System.out.print(arr[k]+" "); 



	}

}
