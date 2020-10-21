// Arrays impelementation of Circular Queue Operations 1. Enqueue 2. Dequeue 3. Peek 4. isFull() 5. isEmpty()
import java.util.Scanner;
class CircularQueue{
  int front = -1;
  int rear = -1;
  int[] arr = new int[5];

  // Insertion operation
  void enqueueAtRear(int item){
      // overflow
      if(isFull()){
            System.out.println("Overflow!! Queue is full...");
      }
      else{
          // initial case
          if(front == -1)
              front = 0;
          if(rear == arr.length-1)
              rear = 0;    // re-initialize rear
          else
            rear = rear+1;

          arr[rear] = item;
          System.out.println("Element is: "+arr[rear]);
      }
  }

  // Deletion Operation
  int dequeueAtFront(){
      // underflow
      if(isEmpty()){
          System.out.println("Underflow!! Queue is empty....");
          return 0;
      }
      else{
          int temp = arr[front];
          if(front == rear){
            front = -1;
            rear = -1;
            return temp;
          }
          /*if(front == arr.length-1)
              front = 0;
          else
            front  = front +1;
            */
          front = (front+1) % 5;

          return temp;
      }

  }

  // Peek operation
  int peekAtFront(){
    // underflow
    if(isEmpty()){
        System.out.println("Underflow!!... Queue is empty");
        return 0;
    }
    else
      return arr[front];
  }

  // Overflow condition check
  boolean isFull(){
    if(front == 0 && rear == arr.length-1 || front == rear+1)
        return true;
    else
        return false;
  }

  // underflow condition check
  boolean isEmpty(){
      if(front == -1)
          return true;
      else
          return false;
  }


  public static void main(String[] args){
      CircularQueue queue = new CircularQueue();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 elements: ");
      for(int i = 0; i <= 4; i++){
            queue.enqueueAtRear(sc.nextInt());
      }

      System.out.println("Element at the front is: "+queue.peekAtFront());

      System.out.println("Element to be deleted is: "+queue.dequeueAtFront()); // 10
      System.out.println("Element to be deleted is: "+queue.dequeueAtFront()); // 20

      queue.enqueueAtRear(55);

      System.out.println("Element at the front is: "+queue.peekAtFront());
      System.out.println("Element to be deleted is: "+queue.dequeueAtFront());
      System.out.println("Element to be deleted is: "+queue.dequeueAtFront());
      System.out.println("Element to be deleted is: "+queue.dequeueAtFront());

        System.out.println("Element at the front is: "+queue.peekAtFront());
        System.out.println("Element to be deleted is: "+queue.dequeueAtFront());
          System.out.println("Element to be deleted is: "+queue.dequeueAtFront());
  }
}
