// Stack implementation using Linked List
// Operations 1. Push() 2. Pop() 3. Peek() 4. isFull() 5. isEmpty()
import java.util.Scanner;
class StackNode{
  int data;
  StackNode next;
}
class StackListImpl{
  StackNode top = null;  // points to the top of the Stack

  // insertion into stack
  void push(int data){

      StackNode newNode = new StackNode();

      // check for overflow
      if(isFull(newNode)){
          System.out.println("OVERFLOW!!... Stack is Full!");
      }
      else{
          newNode.data = data;
          newNode.next = top;
          top = newNode;
      }
  }

  // deleting the top element
  int pop(){
    if(isEmpty()){
           System.out.println("UNDERFLOW!!! Stack is Empty");
           return 0;
       }
       else{
           StackNode temp = top;
           int var = temp.data;
           top = temp.next;
           temp.next = null;
           temp = null;
           return var;
       }
  }

  // see the top element
  int peek(){
    if(isEmpty()){
         System.out.println("UNDERFLOW!!! Stack is Empty");
         return 0;
     }
     else{
         return top.data;
     }

  }

  // Check if stack is full --> OVerflow
  boolean isFull(StackNode node){
      if(node == null)        // no address is allocated to new node
          return true;
      else
          return false;
  }

  // Check if the stack is empty --> Underflow
  boolean isEmpty(){
        if(top == null)
          return true;
        else
          return false;
  }

  // Print stack elements
  void printStack(){
        System.out.print("[");
        while(top != null){
            System.out.print(pop()+" ");
        }
        System.out.print("]");
    }

  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StackListImpl stack = new StackListImpl();

        System.out.println("Enter stack size: ");

        int size = sc.nextInt();

        System.out.println("Enter "+size+" elements: ");

        for(int i = 0; i < size; i++){
              stack.push(sc.nextInt());
        }

        // Return the top element
        System.out.println("Top element of my stack is: "+stack.peek());

        // Delete one element from the top
        System.out.println("Popped element is: "+stack.pop());

        // Print the stack
        stack.printStack();


  }
}
