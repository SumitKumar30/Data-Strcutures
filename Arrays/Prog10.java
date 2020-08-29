import java.util.Scanner;

public class Prog10
{

	static void palindrome(String[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].equals(arr[arr.length -i-1]))
			{
				continue;
			}
			else
			{
				System.out.println("not a palindrome");
				System.exit(0);
			}


		}
		System.out.println("Is a palindrome");
	}


	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		System.out.println("enter the size of String array");
		int size = inn.nextInt();
		String[] arr = new String[size];

		System.out.println("enter elements inside array");
		for (int i=0;i< size ;i++ )
		{
			arr[i] = inn.next();
		}

		palindrome(arr);
	}
}
