import java.util.Scanner;

public class Prog5
{
	public static void main(String[] args) {

		Scanner inn = new Scanner(System.in);
		System.out.print("No of Row: ");
		int row = inn.nextInt();
		System.out.print("No of column: ");
		int col = inn.nextInt();
		int[][] arr = new int[row][col];

		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
			{
				int flag=1;
				do{
					flag=1;
					arr[i][j]=inn.nextInt();
					if(arr[i][j]>99)
					{
						flag=0;
						System.out.println("no is greater 2 digit");
					}
					else
					{
						if(arr[i][j]%2!=0)
						{
							arr[i][j] = arr[i][j]*2;
							if(arr[i][j]>99)
							{
								flag=0;
								System.out.println("no is greater 2 digit");
							}
						}
						else
						{
							continue;
						}
					}
				}while(flag==0);
			}


			for(int i=0; i<row; i++)
			{
				for(int j=0; j<col; j++)
				{
					System.out.print(arr[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}


	}
}
