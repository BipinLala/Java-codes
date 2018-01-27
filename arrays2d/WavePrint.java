package arrays2d;

import java.util.Scanner;

public class WavePrint 
{
	
	static void wavePrint(int input[][])
	{
		int m = input.length;
		int n = input[0].length;
		int count =0;
		int r = 0;
		int c = 0;
		
		while(count < m*n)
		{
			if(r==0 && c==0)
			{
				for(r=0; r<m; r++)
				{
					System.out.print(input[r][c]+" ");
					count++;
				}
			}
			
			else if(r==m)
			{
				c++;
				for(r=m-1; r>=0;r--)
				{
					
					System.out.print(input[r][c]+" ");
					count++;
				}
			}
			if(r<0)
				r=0;
			
			
			else if(r==0)
			{
				c++;
				for(r=0; r<m; r++)
				{
					System.out.print(input[r][c]+" ");
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
		
int arrr[][] = {{11,2,33,6}, {2,6,1,9}, {7,12,5,2}, {6,8,13,0}};
		wavePrint(arrr);


		
		
	}

}
