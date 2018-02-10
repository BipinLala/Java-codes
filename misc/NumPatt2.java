import java.util.Scanner;

public class NumPatt2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			int a=i;
			int b=0;
			for(int k=1;k<=i;k++)
			{
				System.out.print(a);
				a++;
				b=a-1;
			}
			
			for(int z=1;z<=i-1;z++)
			{
				b--;
				System.out.print(b);
			}
			
			System.out.println();
		}

	}

}
