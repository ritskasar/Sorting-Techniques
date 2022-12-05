import java.util.*;
class InsertionSort
{
	public static void SortNum(int arr[])         // Function Declaration
	{
		System.out.println("Sorting Numbers = ");

		for(int i=0;i<arr.length;i++)           // Output of array
		{
			System.out.print(arr[i] +"  ");
		}

		System.out.println();
	}


	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter size of array . . ");
		int size = in.nextInt();
		System.out.println("Enter numbers into array");
		int arr[] = new int[size];                    // array declaration

		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=in.nextInt();            // Input of array . .
		}

// Insertion Sort Method . . .      Time Complexity = O(n^2)

		for(int i=1;i<arr.length;i++)
		{
			int current = arr[i];
			int j = i-1;

			while(j>=0 && arr[j]>current)
			{
				arr[j+1] = arr[j];
				j--;
			}

			arr[j+1] = current;
		}

		SortNum(arr);                   //Function calling . .
	}
}