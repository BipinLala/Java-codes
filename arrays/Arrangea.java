package arrays;

import java.util.Scanner;

public class Arrangea {
	
	static int[] arrange(int n) 
	{
		int arr[]= new int[n];
		
		int a=1, b, l;
		 if(n%2 == 0)
		 {
			 l = n/2;
			 b = n;
		 }
		 
		 else
		 {
			 l = (n+1)/2;
			 b = n-1;
		 }
		 
		 for(int i=0; i<l;i++)
		 {
			 arr[i] = a;
			 a+=2;
		 }
		 
		 for(int j=l+1; j<n; j++)
		 {
			 arr[j] = b;
			 b-=2;
		 }
		 return arr;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int d = scan.nextInt();
		
	}

}
