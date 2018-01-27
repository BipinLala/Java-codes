package arrays2d;

import java.util.Scanner;

public class RowSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int m, n, sum=0;
		
		m=scan.nextInt();
		n=scan.nextInt();
		
		int arr[][] = new int[m][n];
		
		for(int k=0; k<arr.length; k++)
		{
			for(int l=0; l<arr[k].length; l++)
			{
				arr[k][l] = scan.nextInt();
			}
		}

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				sum += arr[i][j];
			}
			
			System.out.print(sum+" ");
			sum = 0;
		}

	}

}
