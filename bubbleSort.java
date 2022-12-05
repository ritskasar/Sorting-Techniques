import java.util.*;
class bubbleSort
{

	public static void SortNo(int arr[])           // function declaration....
	{
		System.out.println("Sorted Elements are...");

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");     // output of arrays....
		}

		System.out.println();
	}


	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = in.nextInt();
		System.out.println("Enter numbers into array...");
		int arr[]=new int [size];                      // declaration of array

		for(int i=0;i<arr.length;i++)
		{                                     // input of array
			arr[i]=in.nextInt();
		}

// Bubble Sort . . .                  time complexity = O(n^2)

		for(int i=0;i<arr.length;i++)          //outer loop
		{
			for(int j=0;j<arr.length-1-i;j++)     //inner loop
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];         //swapping elements
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		SortNo(arr);                        //function calling

	}
}
