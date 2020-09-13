// Doubly Linked List Custom implementation. Insertion/Deletion at the begenning and at a specific position

import java.util.Scanner;
public class DoublyListDemo{
  private Node first; // ref to first link on LinkedList
  private Node last; // ref to last link on LinkedList
  // static int size = 0; // size of linked list

  /**
    * Insert New Node at first position of Doubly LinkedList
    */

   public void insertFirst(int data){ // insert at front of list
          Node newNode = new Node(data); // creation of new node.
          if (first == null) // means LinkedList is empty.
                 last = newNode; //  newNode <--- last
          else
                 first.previous = newNode; // newNode <-- old first
          newNode.next = first; // newNode --> old first
          first = newNode; // first --> newNode
   }

   /* Function to insert a new Node at the end of Doubly LinkedList */
    public void insertAtEnd(int val)
    {
        Node newNode = new Node(val);
        // if this is the first time you're inserting a node
        if(first == null)
        {
            first = newNode;
            last = first;
        }
        else
        {
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }

    }

    /* Function to insert a node at a given position */
   public void insertAtPos(int val , int pos)
   {
       Node newNode = new Node(val);
       if (pos == 1)
       {
           insertFirst(val);
           return;
       }
       Node ptr = first;
       for(int count = 1; count < pos-1; count++ ){
             ptr = ptr.next;
       }
               Node tmp = ptr.next;
               ptr.next = newNode;
               newNode.previous = ptr;
               newNode.next = tmp;
               tmp.previous = newNode;
               ptr = ptr.next;
   }

   /**
    * Delete first node of Doubly linkedList.
    */
   public Node deleteFirst() {

          if(first==null){  //means LinkedList in empty, throw exception.
                 System.out.println("LinkedList doesn't contain any Nodes.!!");
          }

          Node tempNode = first;
          if (first.next == null) // if only one item
                 last = null; // null <-- last
          else
                 first.next.previous = null; // null <-- old next
          first = first.next; // first --> old next
          return tempNode;
   }

  // Delete a node at a specific position

   public void deleteAtPos(int pos)
    {
        if (pos == 1)
        {
            if (first.next == first) // list has only a single node
            {
                first = null;
                last = null;

                return;
            }
            first = first.next;
            first.previous = null;
            return ;
        }
        Node tmp = first;
        int tail = 0;
        while(tmp != null){
          tmp = tmp.next;
          tail++;
        }
        if (pos == tail) // if the node to be deleted is at the end
        {
            last = last.previous;
            last.next = null;
            return;
        }
        Node ptr = first.next;
        for(int count = 1; count < pos-1; count++ ){
              ptr = ptr.next;
        }
        Node p = ptr.previous;
        Node n = ptr.next;

        p.next = n;
        n.previous = p;

        ptr = ptr.next;
    }


   /*
    * Display Doubly LinkedList in forward direction
    */
   public void displayFrwd() {
          System.out.print("Displaying in forward direction [first--->last] : ");
          Node tempDisplay = first; // start at the beginning of linkedList
          while (tempDisplay != null){ // Executes until we don't find end of list.
                 tempDisplay.displayNode();
                 tempDisplay = tempDisplay.next; // move to next Node
          }
          System.out.println("");
   }


   /*
    * Display Doubly LinkedList in backward direction
    */
   public void displayBckwrd() {
          System.out.print("Displaying in backward direction [last-->first] : ");
          Node tempDisplay = last; // start at the end of linkedList
          while (tempDisplay != null) {// Executes until we don't find start of list.
                 tempDisplay.displayNode();
                 tempDisplay = tempDisplay.previous; // move to previous Node
          }
          System.out.println("");
   }
    public static void main(String[] args){
      DoublyListDemo list = new DoublyListDemo();
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the no. of elements: ");
      int size = sc.nextInt();

      System.out.println("Enter the elements: ");
      for(int i = 0; i < size; i++){
            // list.insertFirst(sc.nextInt());
            list.insertAtEnd(sc.nextInt());
      }

      list.displayFrwd(); // display DoublyLinkedList
      list.displayBckwrd();

      System.out.println("Enter the position where you want to insert newNode: ");
      int position = sc.nextInt();

      System.out.println("Enter the node value: ");
      int value = sc.nextInt();

      list.insertAtPos(value, position);

      list.displayFrwd();

      System.out.println("Enter the position from where you want to delete a node: ");
      int delPos = sc.nextInt();

      list.deleteAtPos(delPos);

      list.displayFrwd();

      System.out.print("Deleted Nodes: ");
      Node deletedNode = list.deleteFirst(); //delete Node
      deletedNode.displayNode();                                 //display deleted Node.
      deletedNode = list.deleteFirst();      //delete Node.
      deletedNode.displayNode();                                 //display deleted Node.

      System.out.println();// sysout used to format output

      list.displayFrwd(); // display DoublyLinkedList
      list.displayBckwrd();
    }
}
