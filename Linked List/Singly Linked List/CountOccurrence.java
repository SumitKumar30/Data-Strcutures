// Program to get the first and last position of an element in a singly linked List
import java.util.Scanner;
class CountOccurrence{
  Node head;

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

    void getPosition(int key){
      Node temp = head;
      int count = 0;
      int position = 0;
      while(temp != null){
          position++;
          if(temp.data == key){
              count++;
              if(count == 1)
                System.out.println("Element first occurred at position: "+position);
              else
                count = position;
          }
          temp = temp.next;
      }
      System.out.println("Element last occurred at position: "+count);
    }

    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


  public static void main(String[] args){
      CountOccurrence count = new CountOccurrence();

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number of elements: ");

      int size = sc.nextInt();

      System.out.println("Enter "+size+" elements: ");

      for(int i = 0; i < size; i++){
        count.push(sc.nextInt());
      }

      System.out.println("Entered elements are: ");
      count.printList();


      System.out.println("Enter the element to check its position of occurence: ");

      int element = sc.nextInt();

      count.getPosition(element);

  }
}
