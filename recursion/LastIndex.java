package recursion;

public class LastIndex {
	
	public static int usingIndex(int input[], int x, int i)
	{
		if(i < 0)
			return -1;
		
		if(input[i] == x)
			return i;
		
		return usingIndex(input, x, i-1);
	}
	
	public static int lastIndex(int input[], int x)
	{
		return usingIndex(input, x, input.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int arr1[] = {1,2,3,5,5,4,5,6,7,5,8,5,9,10,5};
		System.out.println(lastIndex(arr1, 8));



	}

}
