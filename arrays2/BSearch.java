package arrays2;

import java.util.Scanner;

public class BSearch 
{
	static int binarySearch(int[] arr, int num)
	{
		int lb=0, ub=arr.length-1, mid=0;
		
		while(lb <= ub)
		{
			mid = (lb + ub)/2;
			
			if(arr[mid] == num)
			{
				return mid;
			}
			
			else if(arr[mid] > num)
			{
				ub = mid-1;
			}
			
			else 
			{
				lb = mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 4, 6, 7, 9, 11};
		
		System.out.println(binarySearch(arr, 11));


	}

}
