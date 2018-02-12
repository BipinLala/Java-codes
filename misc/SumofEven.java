import java.util.Scanner;

public class SumofEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				sum+=i;
			
		}
		System.out.println(sum);
		

	}

}
