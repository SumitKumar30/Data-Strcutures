// Arrays operations -- 1. Creation 2. Traversal 3. Insertion 4. Deletion 5. Search
import java.util.Scanner;
public class ArrayOperations{
  // Search operation --> linear Search
  static void linearSearch(int[] arr, int key){
      boolean flag = false;
      for(int i = 0; i < arr.length; i++){
          if(arr[i] == key){
              System.out.println("Element Found at location "+i);
              flag = true;
          }
      }
      if(flag == false)
          System.out.println("Element not found!!");
  }

  // insertion
  static void insertAtLoc(int[] arr, int key, int position, int n){
        if(n < arr.length){
            for(int i = n; i > position; i-- ){
                  arr[i] = arr[i-1];
            }
            arr[position] = key;
        }
        else
          System.out.println("OVERFLOW - NO MORE SPACE!!!");
  }

  // Deletion
  static void deleteElement(int [] arr, int key){
      int pos = 0;
      boolean flag = false;
      if(arr.length != 0){
          for(int i = 0; i < arr.length; i++){
              if(arr[i] == key){
                    pos = i;
                    flag = true;
                    break;
              }
          }
          if(flag == true){
              for(int i = pos + 1; i < arr.length; i++){
                    arr[i - 1] = arr[i];
              }

          }
      }
      else
        System.out.println("UNDERFLOW - ARRAY IS EMPTY!!!");
  }

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size: ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter the number of elements you want to insert: ");
      int count = sc.nextInt();
      System.out.println("Enter elements inside array: ");
      for(int i = 0; i < count; i++ ){
            arr[i] = sc.nextInt();
      }
      System.out.println("Enter element to search: ");
      int value = sc.nextInt();
      linearSearch(arr, value);

      System.out.println("Enter the element to insert: ");
      int ele = sc.nextInt();

      System.out.println("Enter the location to insert: ");
      int pos = sc.nextInt();

      insertAtLoc(arr, ele, pos, count);
      System.out.println("Updated array is: ");
      for(int data: arr)
          System.out.println(data);

      System.out.println("Enter the element to delete: ");
      int del = sc.nextInt();

      deleteElement(arr, del);

      System.out.println("Updated array is: ");
      int length = arr.length - 1;
      for(int i = 0; i < length ; i++)
          System.out.println(arr[i]);

  }
}
