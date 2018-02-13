import java.util.Scanner;

public class Patt5 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i)
					System.out.print("1");
				else
					System.out.print("2");
			}
			
			System.out.println();
		}
	}
}
