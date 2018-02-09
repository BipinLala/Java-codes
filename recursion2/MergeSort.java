package recursion2;

import java.util.Scanner;

public class MergeSort 
{
	//static int input[];
	public static void mergeSort(int input[])
	{
		if(input.length == 1)
			return;
		
		
		int leftArr[] = new int[input.length/2];
		int rightArr[] = new int[input.length-leftArr.length];
		
		for(int i=0; i<leftArr.length; i++)
		{
			leftArr[i] = input[i];
		}
		
		for(int i=leftArr.length; i<input.length; i++)
		{
			rightArr[i-leftArr.length] = input[i];
		}
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, input);
	}
	
	static int[] merge(int arr1[], int arr2[], int result[]) 
	{
		int a=0, b=0, c=0;
		
		while(a<arr1.length && b<arr2.length)
		{
			if(arr1[a] <= arr2[b])
			{
				result[c++] = arr1[a++];
			}
			
			else
			{
				result[c++] = arr2[b++];
			}
		}
		
		while(a<arr1.length)
		{
			result[c++] = arr1[a++];
			
		}
		
		while(b<arr2.length)
		{
			result[c++] = arr2[b++];
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner (System.in);
		
		int arr3[] = {2,4,1,6,3,5,0};
	
		
		mergeSort(arr3);
//		for(int k=0; k<input.length; k++)
//			System.out.print(input[k]+" "); 

	}

}
