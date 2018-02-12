import java.util.Scanner;

public class SumorProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int c=scan.nextInt();
		double sum=1;
		
		switch(c)
		{
		case 1:
			for(int i=1;i<=n;i++)
			{
				sum+=i;
			}
			System.out.println((int)sum-1);
			break;
			
		case 2:
			for(int i=1;i<=n;i++)
			{
				sum*=i;
			}
			System.out.println((int)sum);
			break;
			
			default:
				System.out.println("-1");
				break;
				
				
				
		}

	}

}
