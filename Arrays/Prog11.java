import java.util.Scanner;


public class Prog11
{
	public static void main(String[] args) {

		Scanner inn = new Scanner(System.in);
		System.out.print("enter no. of rows: ");
		int row = inn.nextInt();

		int[][] arr = new int[row][row];



		for (int i = 0; i < arr.length; i++)
		{
			arr[i][0] = 1;
			arr[i][i] = 1;
			for (int j = 1; j < i; j++)
			{
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int z=arr.length-i; z>0;z--)
			{
				System.out.print(" ");
			}

			for(int j = 0; j <=i; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
