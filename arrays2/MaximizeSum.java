package arrays2;

import java.util.Scanner;

public class MaximizeSum {
	
	static long maximumSumPath(int[] input1, int[] input2)
	{
		int a=0, b=0;
		long sum1 =0, sum2=0, result=0;
		
		while(a<input1.length && b<input2.length)
		{
			if(input1[a] < input2[b])
			{
				sum1 += input1[a++];
			}
			
			else if(input1[a] > input2[b])
			{
				sum2 += input2[b++];
			}
			
			else
			{
				result = result + Math.max(sum2, sum1) + input1[a] ;
				a++;
				b++;
				sum1=0;
				sum2=0;
			}
			
		}
		
		while(a < input1.length)
		{
			 sum1 += input1[a++];
		}
		
		while(b < input2.length)
		{
			sum2 += input2[b++];
		}
		
		result  = result + Math.max(sum2, sum1);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int arr3[] = {1,3,4,7,11, 25,27,46};
		int arr4[] = {2,4, 5,7 ,25,46};
		
		System.out.println(maximumSumPath(arr3, arr4));


	}

}
