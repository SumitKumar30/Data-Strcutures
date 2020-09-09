// Program to remove duplicates from an unsorted linked List
import java.util.Scanner;
class RemoveDuplicates{
  Node head;
  /* Function to remove duplicates from an
      unsorted linked list */
   void remove_duplicates() {
       Node ptr1 = null, ptr2 = null, dup = null;
       ptr1 = head;

       /* Pick elements one by one */
       while (ptr1 != null && ptr1.next != null) {
           ptr2 = ptr1;

           /* Compare the picked element with rest
               of the elements */
           while (ptr2.next != null) {

               /* If duplicate then delete it */
               if (ptr1.data == ptr2.next.data) {

                   /* sequence of steps is important here */
                   dup = ptr2.next;
                   ptr2.next = ptr2.next.next;
                   System.gc();
               } else /* This is tricky */ {
                   ptr2 = ptr2.next;
               }
           }
           ptr1 = ptr1.next;
       }
   }
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

   void printList() {
     Node temp = head;
     while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
     }
     System.out.println();
   }
  public static void main(String[] args){
    RemoveDuplicates rmdpl = new RemoveDuplicates();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements: ");

    int size = sc.nextInt();

    System.out.println("Enter "+size+" elements: ");

    for(int i = 0; i < size; i++){
      rmdpl.push(sc.nextInt());
    }

        System.out.println("Linked List before removing duplicates : \n ");
        rmdpl.printList();

        rmdpl.remove_duplicates();
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        rmdpl.printList();
  }
}
