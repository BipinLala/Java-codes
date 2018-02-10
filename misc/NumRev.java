import java.util.Scanner;

public class NumRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int num=n;
		int digit=0,rev=0;
		
		while(num>0)
		{
			digit=num%10;
			rev=(rev*10)+digit;
			num/=10;
		}
		
		System.out.println(rev);
		

	}

}
