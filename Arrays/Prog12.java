import java.util.Scanner;


public class Prog12
{

	public static void main(String[] args) {

		Scanner inn = new Scanner(System.in);
		int arr[][] = new int[6][5];

		System.out.println("Enter data for every sales person");
		for (int i=0; i<5;i++)
		{
			System.out.println("Product: " + i+1);

			for(int j=0; j<4; j++)
			{
				System.out.println("Sales Person: " + j+1);
				arr[i][j] = inn.nextInt();
			}
		}


		// row total
		for(int j=0;j<4;j++)
		{
			for(int i=0;i<5;i++)
			{
				arr[5][j] = arr[5][j] + arr[i][j];
			}
		}

		// column total
		System.out.println();
		System.out.println("final output");
		System.out.println();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][4] = arr[i][4] + arr[i][j];
			}
		}




		// table output
		for (int i=0; i<6;i++)
		{
			if(i==5)
				{
					System.out.println("-  -  -  -  -");
				}
			for(int j=0; j<5; j++)
			{
				if(i==5 && j==4)
				{
					continue;
				}
				if(j==4)
				{
					System.out.print("|");
				}

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}




	}
}
