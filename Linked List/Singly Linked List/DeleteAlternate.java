// Program to delete alternate nodes of a singly linked List
import java.util.Scanner;
class DeleteAlternate{
  Node head;
  void deleteAlt()
    {
       if (head == null)
          return;

       Node prev = head;
       Node now = head.next;

       while (prev != null && now != null)
       {
           /* Change next link of previus node */
           prev.next = now.next;

           /* Free node */
           now = null;

           /*Update prev and now */
           prev = prev.next;
           if (prev != null)
              now = prev.next;
       }
    }


    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.println();
    }
  public static void main(String[] args){
    DeleteAlternate del = new DeleteAlternate();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements: ");

    int size = sc.nextInt();

    System.out.println("Enter "+size+" elements: ");

    for(int i = 0; i < size; i++){
      del.push(sc.nextInt());
    }

    System.out.println("Entered elements are: ");
    del.printList();

    del.deleteAlt();

    System.out.println("List after deleting alternate elements: ");

    del.printList();


  }
}
