// Queue implementation using Linked List --> Enqueue, Dequeue, Peek
import java.util.Scanner;
class QueueListImpl{
    QueueNode front = null;
    QueueNode rear = null;

    // Enqueue operation
    void insertAtRear(int item){
        QueueNode newNode = new QueueNode();
        newNode.data = item;
        newNode.next = null;
        if(rear != null)    // Not the first time
              rear.next = newNode;
        rear = newNode;
        if(front == null)  // this is the first time
            front = newNode;
    }

    // Dequeue operation
    int deleteAtFront(){
        // condition for Underflow
        if(front == null){
            System.out.println("Queue is Empty!!!");
            return 0;
        }
        else{
            QueueNode temp = front;
            int value = temp.data;
            front = temp.next;
            temp.next = null; // to detach the front node completely
            temp = null;  // Removed every reference to the front node
            return value;
        }
    }

    // Peek --> Return the first element
    int peekAtFront(){
        // condition for Underflow
        if(front == null){
            System.out.println("Queue is Empty!!");
            return 0;
        }
        else{
          return front.data;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueListImpl queue = new QueueListImpl();

        System.out.println("Enter the Queue size: ");
        int size = sc.nextInt();

        System.out.println("Enter "+size+" no. of elements: ");
        for(int i = 0; i < size; i++)
            queue.insertAtRear(sc.nextInt());

        System.out.println("Element at the front is: "+queue.peekAtFront());

        System.out.println("Deleted element is: "+queue.deleteAtFront());

        queue.insertAtRear(88);

        System.out.println("Element at the front is: "+queue.peekAtFront());
    }
}
