package arrays2d;

import java.util.Scanner;

public class LargestRorC 
{
	
	static void findLargest(int input[][])
	{
		int r = input.length;
		int c = input[0].length;
		int a=0, sum=0, sum2=0;
		int ans[] = new int[r+c];
		
		for(int i =0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				sum += input[i][j];
				
			}
			
			ans[a++] = sum;
			sum = 0;
		}
		
		for(int k = 0; k<c; k++)
		{
			for(int l=0; l<r; l++)
			{
				sum2 += input[l][k];
				
			}
			
			ans[a++] = sum2;
			sum2 = 0;
			
		}
		
		int max =ans[0], pos=0;
		
		for(int z = 0; z<ans.length; z++)
		{
			if(max < ans[z])
			{
				max = ans[z];
				pos = z;
			}
		}
		
		if(pos < r)
		{
			System.out.println("row " + pos +" "+ max);
		}
		
		else
		{
			System.out.println("column "+ (pos-r) +" "+ max);
		}
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int arrr[][] = {{11,2,33}, {2,6,1}, {7,12,5}, {6,8,13}};
		findLargest(arrr);

	}

}
