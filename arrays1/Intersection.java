package arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
	
	
	static void intersection(int[] arr1, int[] arr2)
	{
		int a=0,b=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		while(a<arr1.length && b<arr2.length)
		{
			if(arr1[a] == arr2[b])
			{
				System.out.println(arr1[a]);
				a++;
				b++;
			}
			
			else if(arr1[a] > arr2[b])
			{
				b++;
			}
			
			else
			{
				a++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11};
		
		int str[] = {5 , 6 , 3 , 1  , 7 , 9, 5 ,2};
		
		intersection(arr, str);


		
		

	}

}
