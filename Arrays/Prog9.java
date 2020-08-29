import java.util.Scanner;

public class Prog9
{

	static void sort(int[][] arr)
	{
		for (int i=0;i< arr.length;i++ )
		{
			if(arr[i][0]>arr[i][1])
			{
				int temp = arr[i][0];
				arr[i][0] = arr[i][1];
				arr[i][1] = temp;
			}

		}

		for (int i=0;i< arr.length ;i++ )
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);

		System.out.println("enter the size of array");
		int size = inn.nextInt();
		int[][] arr = new int[size][2];


		System.out.println("enter elements inside array");
		for (int i=0;i< size ;i++ )
		{
			for(int j=0; j<2; j++)
			{
				arr[i][j] = inn.nextInt();
			}

		}

		sort(arr);
	}
}
