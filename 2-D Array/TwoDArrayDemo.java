// 2-D Arrays Demo
import java.util.Scanner;
class TwoDArrayDemo{
  public static void main(String[] args){

      // Creating a 2-D Array
      int[][] arr = new int[3][3];

      int[][] arr2 = {
        {1, 2, 3},
        {4, 5},
        {6, 7, 8, 9}
      };

      System.out.println("Elements in Row 1: "+arr2[0].length);
      System.out.println("Elements in Row 2: "+arr2[1].length);
      System.out.println("Elements in Row 3: "+arr2[2].length);

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the elements: ");

      for(int i = 0 ; i < arr.length; i++){
        for(int j = 0; j < arr[i].length; j++ ){
            arr[i][j] = sc.nextInt();
        }
      }

      System.out.println("Array elements are: ");
      for(int i = 0; i < arr.length; i++){
          for(int j = 0; j < arr[i].length; j++){
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }
      System.out.println("No. of elements in Row 1: "+arr[0].length);
      System.out.println("No. of elements in Row2: "+arr[1].length);
      System.out.println("No. of elements in Row 3: "+arr[2].length);

  }

}
