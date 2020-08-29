// Create an array of integer with size n. Return the difference between the largest and the smallest value inside that array.
import java.util.Scanner;
class Prog1{
  static int diffLargestSmallest(int[] arr){
    int large = arr[0];
    int small = arr[0];
    for(int i = 0; i < arr.length; i++){
        if(small > arr[i])
            small = arr[i];
        if(large < arr[i])
            large = arr[i];
    }
    return (large - small);

  }

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size: ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter the elements: ");
      for(int i = 0; i < size; i++){
          arr[i] = sc.nextInt();
      }
      int result = diffLargestSmallest(arr);
      System.out.println("Difference b/w the largest and smallest value is: "+result);
  }
}
