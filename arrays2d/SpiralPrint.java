package arrays2d;

import java.util.Scanner;

public class SpiralPrint 
{
	static void spiralPrint(int matrix[][])
	{
		int k = 0;						//first row
		int l = 0;						//first column
		int m = matrix.length;			//last row
		int n = matrix[0].length;		//last column
		int i=0;
		
		while(k<m && l<n)
		{
			for(i=l; i<n; i++)
			{
				System.out.print(matrix[k][i]+" ");
			}
			k++;
			
			for(i=k; i<m; i++)
			{
				System.out.print(matrix[i][n-1]+" ");
			}
			n--;
			
			if(k < m)
			{
				for(i=n-1; i>=l; i--)
				{
					System.out.print(matrix[m-1][i]+" ");
				}
				m--;
			}
			
			if(l < n)
			{
				for(i=m-1; i>=k; i--)
				{
					System.out.print(matrix[i][l]+" ");
				}
				l++;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int arrr[][] = {{11,2,33,6, 7}, {2,6,1,9, 8}, {7,12,5,2, 4}, {6,8,13,0,9}, {1,2,3,4,5}};
				spiralPrint(arrr);


	}

}
