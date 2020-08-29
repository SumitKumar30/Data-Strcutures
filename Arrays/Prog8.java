import java.util.Scanner;

public class Prog8
{

	static float median(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
            for (int j = i+1; j < arr.length; j++)
            {
               if(arr[i] > arr[j])
               {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
            }
        }


        if (arr.length % 2 != 0)
        	return (float) arr[arr.length / 2];

        return (float) ( arr[(arr.length-1)/2] + arr[arr.length/2]) /2;
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

		System.out.println("Median of the given elements is: "+median(arr));
	}
}
