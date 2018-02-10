import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		
		int s=scan.nextInt();
		int e=scan.nextInt();
		int w=scan.nextInt();	
		
		int c;
		
		for(int i=s;i<=e;i+=w)
		{
			c=((i-32)*5/9);
			System.out.println(i+"\t"+c);
		}

	}

}
