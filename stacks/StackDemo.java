// Implement Stack using Array
// 1. Push 2. Pop 3. Peek 4. IsFull() 5. IsEmpty()
import java.util.Scanner;
class StackDemo{
    int top = -1; // track of top value in Stack
    static int size = 0;
    int[] stack = null;  // initialize stack
    static Scanner sc = new Scanner(System.in);
    
    StackDemo(){
      System.out.println("Enter the stack size: ");
      size = sc.nextInt();
      stack = new int[size];
    }
    // Insertion into Stack
    void push(int data){
          // check for overflow conditoin
          if(isFull()){
              System.out.println("Overflow!!! No more space left...!");
          }
          else{
                top = top+1;
                stack[top] = data;
          }
    }

    // Deletion from Stack
    int pop(){
        if(isEmpty()){
            System.out.println("Underflow!!!... Stack is Empty!");
            return 0;
        }
        else{
            int temp = stack[top];
            top = top-1;
            return temp;
        }
    }

    // Peek element from Stack
    int peek(){
        if(isEmpty()){
          System.out.println("Underflow!!!... Stack is Empty!");
          return 0;
        }
        else
            return stack[top];
    }

    // Overflow condition
    boolean isFull(){
        if(stack.length <= top)
          return true;
        else
          return false;
    }

    // Underflow condition
    boolean isEmpty(){
        if(top < 0)
          return true;
        else
          return false;
    }

    void printStack(){
      System.out.print("[");
      for(int i = top; i >= 0; i--){
            System.out.print(pop()+" ");
      }
      System.out.print("]");
    }

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);

        StackDemo stackRef = new StackDemo();

        System.out.println("Enter "+size+" elements: ");
        for(int i = 0; i < size; i++){
            stackRef.push(sc.nextInt());
        }

        System.out.println("Element at the top of the stack is: "+stackRef.peek());


          // deletion from the Stack
        System.out.println("Element removed ffrom the top is: "+stackRef.pop());

        // print stack elements
        System.out.println("Elements inside stack are: ");
        stackRef.printStack();

        System.out.println();
        System.out.println("Stack is empty: "+stackRef.isEmpty());

    }
}
