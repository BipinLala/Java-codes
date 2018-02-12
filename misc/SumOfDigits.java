import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		 int num=n;
		 int eve=0,odd=0;
		 int digit;
		 
		 while(num>0)
		 {
			 digit=num%10;
			 if(digit%2==0)
				 eve+=digit;
			 else
				 odd+=digit;
			 num/=10;
		 }
		 
		 System.out.println(eve+" "+odd);

	}

}
