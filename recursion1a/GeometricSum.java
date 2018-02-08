package recursion1a;

public class GeometricSum 
{
	static double findGeometricSum(int k)
	{
		if(k==0)
		return 1;
		
		double ans = findGeometricSum(k-1);
		return (Math.pow(2, -k)) + ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findGeometricSum(5));

	}

}
