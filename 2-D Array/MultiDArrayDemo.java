// Create a 2D array , insert elements, how to traverse & display elements
import java.util.Scanner;
class MultiDArrayDemo{
  public static void main(String[] args){

    //2 D array Creation
    int[][] arr = new int[2][3];

    System.out.println("Enter the elements into 2-D array: ");

    Scanner sc = new Scanner(System.in);

    System.out.println("No. of Rows: "+arr.length);

    System.out.println("No. of cols in Row 1: "+arr[0].length);
    System.out.println("No. of cols in Row 2: "+arr[1].length);

    boolean flag = false;
        // check whether the entered element is less than three digits

    for(int i = 0; i < arr.length; i++ ){  // row wise traversal
        for(int j = 0; j < arr[i].length; j++){  // column wise traversal
              arr[i][j] = sc.nextInt();
              if(arr[i][j] >= 100){
                while(true){
                    System.out.println("Wrong Value!! ... Enter again...");
                    // flag = true;
                    arr[i][j] = sc.nextInt();
                    if(arr[i][j] >= 100)
                      continue;
                    else
                      break;
                    // j--;
                  }

              }
              }
        }


    System.out.println("Array elements are: ");

    for(int i = 0; i < arr.length; i++ ){  // row wise traversal
        for(int j = 0; j < arr[i].length; j++){  // column wise traversal
              System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

      // if value is odd then double that element
      System.out.println("Updated matrix is: ");
      for(int i = 0; i < arr.length; i++ ){  // row wise traversal
          for(int j = 0; j < arr[i].length; j++){  // column wise traversal
                if(arr[i][j] % 2 != 0){
                  // arr[i][j] = arr[i][j] * 2;
                  System.out.print(2*arr[i][j]+" ");
                }
                else{
                  System.out.print(arr[i][j]+" ");
                  continue;          // using continue
                }


          }
          System.out.println();
      }

  }

}
