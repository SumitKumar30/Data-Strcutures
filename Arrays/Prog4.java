// Write a program that count occurrence of a given number in the array and its frequency.
import java.util.Scanner;
class Prog4{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size: ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter elements into the array: ");
      for(int i = 0; i < size; i++){
          arr[i] = sc.nextInt();
      }

      // Array to store the frequency of Elements
      int[] freq = new int[arr.length];

      int visited = 1;
      for(int i = 0; i < size; i++){
          int count = 1;
          for(int j = i+1; j < size; j++){
              if(arr[i] == arr[j]){
                  count = count + 1;
                  freq[j] = visited;
              }
          }
          if(freq[i] != visited)
              freq[i] = count;
      }
      for(int i = 0; i < freq.length; i++){
            if(freq[i] != visited)
            System.out.println(freq[i]);
      }

      System.out.println("Enter the element whose frequency you want to know: ");
      int value = sc.nextInt();

  }
}
