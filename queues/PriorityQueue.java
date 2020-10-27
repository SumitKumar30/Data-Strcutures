// Array implementation of a priority Queue. 1. Enqueue 2. Dequeue 3. Peek(Highest priority element) 4. Overflow 5. Underflow
class PriorityQueue{
  int front = -1;
  int rear = -1;
  int[] arr = new int[10];

  // Insertion
  void enqueueAtRear(int item){
    if(isFull()){
        System.out.println("Overflow!! .. Queue is Full");
    }

    // initial case
    if(front == -1)
        front = 0;
    rear = rear+1;
    arr[rear] = item;
  }

  // Deletion
  // Smallest value holds the highest priority
  int dequeueAtFront(){
    if(isEmpty()){
        System.out.println("Underflow!! Queue is Empty");
        return 0;
    }
    else{
        int priority = arr[front];  // holds the highest priority element
        int temp = 0;  // holds the index of highest priority element
        while(front != rear+1){
            if(priority > arr[front]){
              priority = arr[front];
              temp = front;
              front = front+1;
            }
            else
              front = front + 1;
        }
        arr[temp] = arr[rear];
        rear = rear-1;
        front = 0;
        return priority;
    }
  }

  // Peek --> Highest Priority element
  int peekAtFront(){
    if(isEmpty()){
        System.out.println("Underflow!! Queue is Empty");
        return 0;
    }
    else{
        int priority = arr[front];  // holds the highest priority element
        while(front != rear+1){
            if(priority > arr[front]){
              priority = arr[front];
              // temp = front;
              front = front+1;
            }
            else
              front = front + 1;
        }
        front = 0;
        return priority;
    }
  }

  // Overflow
  boolean isFull(){
    if(rear == arr.length-1)
        return true;
    else
        return false;
  }

  // Underflow
  boolean isEmpty(){
     if(front == -1 || front == rear+1)
           return true;
    else
          return false;
  }

  public static void main(String[] args){
      PriorityQueue pqueue = new PriorityQueue();
      pqueue.enqueueAtRear(3);
      pqueue.enqueueAtRear(7);
      pqueue.enqueueAtRear(1);  // Highest Priority Element
      pqueue.enqueueAtRear(8);
      pqueue.enqueueAtRear(4);
      pqueue.enqueueAtRear(11);
      pqueue.enqueueAtRear(6);
      pqueue.enqueueAtRear(12);  // Least Priority Element

      System.out.println("Element with the highest priority is: "+pqueue.dequeueAtFront());

      System.out.println("Element at the peek (2nd highest priority) is: "+pqueue.peekAtFront());
  }
}
