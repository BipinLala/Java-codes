package arrays1;

import java.util.Scanner;

public class FindUnique {
	
	static int findUnique(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int a=1;
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[j]!=0)
				{
					if(arr[i]==arr[j])
					{
						arr[j]=0;
						a=2;
					}
				}
				
				
			}
			if(a==1)
			{
				return arr[i];
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int arr[] = {2, 7, 9, 4, 6, 11, 7 , 2, 4, 11, 9};
		
		System.out.println(findUnique(arr));

		
		

	}

}
