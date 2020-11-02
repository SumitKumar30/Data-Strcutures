// Dequeue using Circular Array . 1. Insert Rear 2. Delete Front 3. Insert Front 4. Delete Rear 5. GetFront 6. GetRear 7. Overflow 8. underflow
class DequeueDemo{
    int front = -1;
    int rear = -1;
    int[] arr = new int[5];     // Circular Array

    // Insertion at Rear
    void insertAtRear(int item){
        if(isFull()){
            System.out.println("Overflow.. Queue is full!");
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
          // System.out.println("Element is: "+arr[rear]);
        }
    }

    // Deletion at Front
    int deleteAtFront(){
        if(isEmpty()){
            System.out.println("Underflow... Queue is empty!");
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

    // Insertion at Front
    void insertAtFront(int item){
        if(isFull()){
            System.out.println("Overflow!!.. Queue is full!");
        }
        else{
            if(front == -1){
                front = 0;
                rear = 0;
            }
            else if(front == 0 || front < 1)
                        front = arr.length-1;
            else
                front = front - 1;
            arr[front] = item;
        }
    }

    // Deletion from Rear
    int deleteAtRear(){
        if(isEmpty()){
          System.out.println("Underflow... Queue is empty!");
          return 0;
        }
        else{
            int temp = arr[rear];
            if(front == rear){
              front = -1;
              rear = -1;
              return temp;
            }
            else
              if(rear == 0)
                  rear = arr.length-1;
              else
                  rear = rear-1;
            return temp;
        }
    }

    // Get the front element
    int getFront(){
        if(front == -1)
          return 0;
        return arr[front];
    }

    // Get the rear element
    int getRear(){
      if(rear == -1)
        return 0;
      return arr[rear];
    }

    // Overflow condition
    boolean isFull(){
          if(front == 0 && rear == arr.length-1 || front == rear + 1)
            return true;
          else
            return false;
    }

    // Underflow Condition
    boolean isEmpty(){
        if(front == -1)
          return true;
        else
          return false;
    }

    public static void main(String[] args){
        DequeueDemo dequeue = new DequeueDemo();
        dequeue.insertAtRear(10);
        dequeue.insertAtRear(20);
        dequeue.insertAtRear(30);
        dequeue.insertAtRear(40);
        dequeue.insertAtRear(50);

        // check the element at front & rear
        System.out.println("Element at rear is: "+dequeue.getRear());
        System.out.println("Element at front is: "+dequeue.getFront());

        // delete from rear
        System.out.println("Element deleted is: "+dequeue.deleteAtRear());

        // delete from front
        System.out.println("Element deleted is: "+dequeue.deleteAtFront());

        // insert at front
        dequeue.insertAtFront(88);

        // get front value
        System.out.println("Element at front now is: "+dequeue.getFront());
    }
}
