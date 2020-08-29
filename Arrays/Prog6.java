import java.util.Scanner;

public class Prog6
{
	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);

		System.out.println("enter the size of array");
		int size = inn.nextInt();
		int[] arr = new int[size];


		System.out.println("enter elements inside array");
		for (int i=0;i< size ;i++ ) {
			arr[i] = inn.nextInt();
		}
		int six=0 , seven=0;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == 6 && arr[i+1]== 6)
			{
				six++;
				continue;
			}

			if(arr[i] == 6 && arr[i+1]== 7)
			{
				seven++;
				continue;
			}
		}

		System.out.println("Number of occurrences of two 6s: " + six);
		System.out.println("Number of occurrences of 6 followed by 7: " + seven);
	}
}
