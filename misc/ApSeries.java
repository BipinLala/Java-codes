import java.util.Scanner;

public class ApSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int x=scan.nextInt();
		int term;
		
		int a=0;
		for(int i=1;i<=1000;i++)
		{
			term=(3*i)+2;
			if((term%4)!=0)
			{
				System.out.print(term+" ");
				a++;
			}
			if(a==x)
				break;
		}
		

	}

}
