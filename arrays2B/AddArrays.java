package arrays2B;

import java.util.Scanner;

public class AddArrays 
{
	static int[] sumOfTwoArrays(int[] arr1, int[] arr2)
	{
		int arr3[];
		char flag = 'n';
		if(arr1.length > arr2.length)
		{
			arr3 = new int[arr1.length+1];
		}
		else
		{
			arr3 = new int[arr2.length+1];
		}
	
		int a,b,c;
		
		for(a=arr1.length-1, b=arr2.length-1, c=arr3.length-1; a>=0 && b>=0;)
		{
			if(flag == 'y')
			{
				arr3[c--] = arr2[b--] + arr1[a--] + 1;
			}
			
			else
			{
				arr3[c--] = arr2[b--] + arr1[a--];
			}
			
			if(arr3[c+1] > 9)
			{
				arr3[c+1] %= 10;
				flag = 'y';
			}
			
			else flag = 'n';	
		}
		
		if(a >= 0)
		{
			while(a>=0)
			{
				if(flag == 'y')
				{
					arr3[c--] = arr1[a--]+1;
					flag = 'n';
				}
				else
				{
					arr3[c--] = arr1[a--];
				}
			}
			
		}
		else
		{
			while(b>=0)
			{	
				if(flag == 'y')
				{
					arr3[c--] = arr2[b--]+1;
					flag = 'n';
				}
				else
				{
					arr3[c--] = arr2[b--];
				}
			}
				

	    }
		
		return arr3;
	
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int arr4[] = {2, 7, 9, 4, 6, 7};
		int arr5[] = {1, 5, 2, 3, 5, 7, 8};
		
		int arr6[] = sumOfTwoArrays(arr4, arr5);
		
		for(int k=0; k<arr6.length; k++)
			System.out.print(arr6[k]+" "); 


	}

}
