import java.util.*;
class SelectionSort
{
	public static void SortNo(int arr[])              //function declaration
	{
		System.out.println("Sorted Elements are");

		for(int i=0 ; i<arr.length ; i++)
		{                                          //output of sorted array
			System.out.print(arr[i] + "  ");
		}

		System.out.println();
	}


	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size of array..");
		int size=in.nextInt();
		System.out.println("Enter numbers into array..");
		int arr[]=new int[size];                          // array declaration

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();                 //array input
		}



//Selection Sort . . . .      Time Complexity = O(n^2)

		for(int i=0;i<arr.length;i++)             //outer loop
		{
			int smallest = a[i];

			for(int j=i+1;j<arr.length;j++)       //inner loop
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}

			int temp = arr[smallest];       //number swapping . . .
			arr[smallest]=arr[i];
			arr[i]=temp;

		}

		SortNo(arr);                   //function calling . .
	}
}