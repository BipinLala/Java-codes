import java.util.Scanner;

public class Patt4 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1&&i==1)
					{
					System.out.print("1");
					break;
					}
				if(j==1||j==i)
					System.out.print(i-1);
				else
					System.out.print("0");
			}
			
			System.out.println();
		}


	}

}
