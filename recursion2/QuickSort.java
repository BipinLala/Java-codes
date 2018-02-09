package recursion2;

public class QuickSort {
	
	
//	static void swap(int input[i], int pivotElement)
//	{
//		int  temp;
//		temp = input[i];
//		input[i] = pivotElement;
//		pivotElement = temp;
//	}
	
	static int getPivotElement(int input[], int start, int end)
	{
		
		int pivotElement = input[end];
		int pivotIndex = input[start];
		
		for(int i = start; i<end; i++)
		{
			if(input[i]<pivotElement)
			{
				//swap(input[i],pivotElement);
				int  temp;
				temp = input[i];
				input[i] = pivotElement;
				pivotElement = temp;
			}
			pivotIndex++;
			int temp = input[i+1];
	        input[i+1] = input[end];
	        input[end] = temp;
		}
		
		return pivotElement;
	}
	
	
	static void quickSort(int input[], int start, int end)
	{
		if(start>=end)
			return;
		
		int pivotIndex = getPivotElement(input,start,end);
		
		quickSort(input, start, pivotIndex-1);
		quickSort(input, pivotIndex+1, end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,3,9,15,7,18,2,4,1,6,0,11};
		
		quickSort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
