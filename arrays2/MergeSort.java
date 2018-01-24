package arrays2;

import java.util.Scanner;

public class MergeSort 
{

	static int[] merge(int arr1[], int arr2[])
	{
		int a, b, c;
		int marr[] = new int[arr1.length+arr2.length];
		
		for(a=0, b=0, c=0; a<arr1.length && b<arr2.length;)
		{
			if(arr1[a] <= arr2[b])
			{
				marr[c++] = arr1[a++];
			}
		
			else 
			{
				marr[c++] = arr2[b++];
			}
		}
			
			if(a<arr1.length)
			{
				while(a<arr1.length)
				{
					marr[c++] = arr1[a++];
				}
			}
			else
			{
				while(b<arr2.length)
				{
					marr[c++] = arr2[b++];
				}
			}
		
		
		return marr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr3[] = {1,3,4,7,11};
		int arr4[] = {2,4,6,13};
		
		int arr5[] = merge(arr3, arr4);
		for(int k=0; k<arr5.length; k++)
			System.out.print(arr5[k]+" "); 


	}

}
