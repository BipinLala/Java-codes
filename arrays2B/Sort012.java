package arrays2B;

import java.util.Scanner;

public class Sort012 
{
	static void sort012(int[] arr)
	{
		int a=0, b=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
				a++;
			
			else if(arr[i]==1)
				b++;
		}
		
		for(int j=0; j < a; j++)
		{
			arr[j]=0;
		}
		
		for(int k=a; k<(a+b); k++)
		{
			arr[k] = 1;
		}
		
		for(int l=a+b; l<arr.length; l++)
		{
			arr[l] = 2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr1[] = {0,1,0,2,1,2,0,1,0,1,2,0,2,1};
		
		sort012(arr1);
		for(int z=0; z<arr1.length;z++)
			System.out.print(arr1[z]);


	}

}
