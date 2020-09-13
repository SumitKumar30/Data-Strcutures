// Decimal to Binary Conversion using linked lists
import java.util.Scanner;
class BinaryConversion{
  Node head = null;
  //addNode() will add a new node to the list
  public void addNode(int data) {
      //Create a new node
      Node newNode = new Node(data);
      //newNode.data = data;
      Node temp = head;
      if(temp == null){
        head = newNode;
      }
      else{
        while(temp.next != null){
          temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
      }
  }

  void convertToBinary(int number){
      int[] binary = new int[40];
      int index = 0;
      while(number > 0){
        binary[index++] = number%2;
        number = number/2;
      }
      for(int i = index-1; i >= 0; i--){
          addNode(binary[i]);
      }

  }

  //display() will display all the nodes present in the list
  public void display() {
      //Node current will point to head
      Node current = head;
      if(head == null) {
          System.out.println("List is empty");
          return;
      }
      while(current != null) {
          //Prints each node by incrementing pointer
          System.out.print("--> "+current.data + " ");
          current = current.next;
      }
      System.out.println();
  }

  public static void main(String[] args){
      BinaryConversion binary = new BinaryConversion();
      boolean flag = false;
      int number = 0;
      Scanner sc = new Scanner(System.in);
      do{
        System.out.println("Enter the Decimal value: ");

        String input = sc.next();
        // if the entered input is not an integer it will throw NumberFormatException
          try{
              number = Integer.parseInt(input);
              System.out.println("Valid Input");
              flag = true;
              }catch(NumberFormatException e){
                  System.out.println("Input is not an integer!!!");
                  flag = false;
              }
      }while(flag == false);
      binary.convertToBinary(number);
      System.out.println("Converted Binary Value is: ");
      binary.display();

  }
}
