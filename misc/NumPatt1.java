import java.util.Scanner;

public class NumPatt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int z=1;z<=n-i;z++)
			{
				System.out.print(" ");
			}
			
			int a =i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		
		

	}

}
