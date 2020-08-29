import java.util.Scanner;

public class Prog7
{

	static void swapPairs(int[] arr )
	{
		for(int i=0; i<arr.length-1; i+=2)
		{

			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}

		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "   ");
		}
	}
	public static void main(String[] args) {

		Scanner inn = new Scanner(System.in);

		System.out.println("enter the size of array");
		int size = inn.nextInt();
		int[] arr = new int[size];


		System.out.println("enter elements inside array");
		for (int i=0;i< size ;i++ )
		{
			arr[i] = inn.nextInt();
		}

		swapPairs(arr);
	}
}
