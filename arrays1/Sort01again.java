package arrays1;

import java.util.Scanner;

public class Sort01again {

	
	static void sortBinaryArray2(int[] arr)
	{
		int a=0, b=arr.length-1;
		int temp;
		while(a<b)
		{
			if(arr[a]==1 && arr[b]==0)
			{
				temp=arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;
				b--;
			}
			else if(arr[a]==0 && arr[b]==0)
			{
				a++;
			}
			
			else if(arr[a]==1 && arr[b]==1)
			{
				b--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr1[] = {0,1,0,1,1,1,0,1,0,1,0};
		
		sortBinaryArray2(arr1);
		for(int z=0; z<arr1.length;z++)
			System.out.print(arr1[z]);


	}

}
