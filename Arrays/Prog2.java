/*
Write a program that initializes an array with ten random integers and then prints four lines of output, containing:
•	Every element at an even index
•	Every odd element
•	All elements in reverse order
•	Only the first and last element

*/
import java.util.*;
class  Prog2{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int arr[]=new int[10];
            char flag = '\0';
            do{
              System.out.println("Array of Random Numbers are: ");
              for (int i = 0; i < arr.length; i++) {
              arr[i] = random.nextInt(50);
              System.out.println(arr[i]);
              }
              System.out.println("Elements at even index:");
              for (int i = 0; i < arr.length; i++) {
              if(i%2==0){
               System.out.println(arr[i]+" at :"+i);
              }
              }
              System.out.println("Elements which are even:");
              for (int i = 0; i < arr.length; i++) {
              if(arr[i]%2==0){
              System.out.println(arr[i]);
              }
              }
              System.out.println("On reversing, Array changes to: ");
              for(int i=arr.length-1;i>=0;i--){
                  System.out.println(arr[i]);
              }
              System.out.println("First Element is: "+arr[0]+" and Last ELement is: "+arr[arr.length-1]);
              System.out.println("Do you want to continue (Y/N): ");
              flag = sc.next().charAt(0);
            }while(flag == 'Y');


    }
}
