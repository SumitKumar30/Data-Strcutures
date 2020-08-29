// General operations 1. Creation 2. Traversal 3. Insertion 4. Deletion 5. Search
import java.util.Scanner;
class LinkedListDemo{
    Node head = null;
    // 1. insertion at the begenning
    void insertAtBeg(int key){
        Node newNode = new Node();
        newNode.data = key;
        if(head == null){
            head = newNode;
        }
        else{
          newNode.next = head;
          head = newNode;
        }

    }

    // 2. insertion at the end
    void insertAtEnd(int key){
          Node newNode = new Node();
          newNode.data = key;
          Node temp = head;
          while(temp.next != null){
            temp = temp.next;
          }
          temp.next = newNode;
          newNode.next = null;
    }

    // 3. insertion at a given position
    void insertAtPos(int position, int key){
        Node newNode = new Node();
        newNode.data = key;
        Node temp = head;
        for(int count = 1; count < position-1; count++ ){
              temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. traversing a SLL
    void traverseLL(){
      Node temp = head;
      while(temp != null){
           System.out.print("--> "+temp.data);
           temp = temp.next;
      }
    }

    // 5. deletion at the begenning
    void deleteAtBeg(){
        Node temp = head;
        head = head.next;
        temp.next = null;
        temp = null;
    }

    // 6. deletion at the end
    void deleteAtEnd(){
        Node temp = head;
        while(temp.next.next != null){
              temp = temp.next;
        }
        temp.next = null;
    }

    // 7. delete a specific value
    void deleteNode(int key){
          Node temp = head;
          Node temp2 = null;
          while(temp.next.data != key){
            temp = temp.next;
            // temp2 = temp.next;
          }
          temp2 = temp.next;
          temp.next = temp.next.next;
          temp2.next = null;
          temp2 = null;
    }


  public static void main(String[] args){
      LinkedListDemo demo = new LinkedListDemo();
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number of elements: ");
      int size = sc.nextInt();

      System.out.println("Enter the elements: ");
      for(int i = 0; i < size; i++){
            demo.insertAtBeg(sc.nextInt());
      }
      demo.traverseLL();

      System.out.println("Enter an element to insert at the end: ");
      int value = sc.nextInt();
      demo.insertAtEnd(value);

      demo.traverseLL();

      System.out.println("Enter an element to enter the position: ");
      int pos = sc.nextInt();

      System.out.println("Enter an element to insert at position: "+pos+": ");
      int value2 = sc.nextInt();
      demo.insertAtPos(pos, value2);

      demo.traverseLL();

      System.out.println();
      System.out.println("Element deleted from the begenning");

      demo.deleteAtBeg();

      demo.traverseLL();


      System.out.println();

      System.out.println("Updated list is: ");

      demo.deleteAtEnd();

      demo.traverseLL();

      System.out.println();

      System.out.println("Enter the element you want to delete: ");
      int del = sc.nextInt();

      demo.deleteNode(del);

      System.out.println("Updated list: ");

      demo.traverseLL();

      // traverse the linked list
      // Node temp = head;
      // while(temp != null){
      //     System.out.print("--> "+temp.data);
      //     temp = temp.next;
      // }


  }
}
