import java.util.Scanner;

public class AvgMarks 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		char ch=scan.next().charAt(0);
		int t1=scan.nextInt();
		int t2=scan.nextInt();
		int t3=scan.nextInt();
		int avg=(t1+t2+t3)/3;
		
		System.out.println(ch);
		System.out.println(avg);
	}

}
