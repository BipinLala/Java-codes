package recursion2;

public class PrintSubsequence {
	
	static void printSub(String input, String smallAns) {
		if (input.length() == 0) {
			System.out.println(smallAns);
			return;
		}

		printSub(input.substring(1), smallAns);
		printSub(input.substring(1), smallAns + input.charAt(0));

	}
	
	public static void printSubsequences(String input)
	{
		printSub(input, "");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSubsequences("abc");
		
		
		

	}

}
