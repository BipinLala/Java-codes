package arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
	
	static void FindTriplet(int[] arr, int x)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				for(int z=j+1; z<arr.length; z++)
				{
					if(arr[i] + arr[j] + arr[z] == x)
					{
						int a[] = new int[3];
						a[0] = arr[i];
						a[1] = arr[j];
						a[2] = arr[z];
						
						Arrays.sort(a);
						for(int k=0; k<3; k++)
						{
							System.out.print(a[k]+" ");
						}
						System.out.println();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11, 3, 4, 6, 7, 9, 5, 2, 1};
		
		FindTriplet(arr,11);

		

	}

}
