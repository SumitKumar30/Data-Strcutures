import java.util.Scanner;
class MergeAlternate{
    static Node first, second;

    Node insert(int key, Node head){
      Node newNode = new Node();
      newNode.data = key;
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
      return head;
    }

    static void shuffleMerge(Node node1, Node node2) {

    Node node1next, node2next;
    first = node1;
    second = node2;

    while(node1 != null && node2 != null) {
      node1next = node1.next;
      node1.next = node2;
      node1 = node1next;
      if(node1next == null && node2.next != null){
        node1 = node2.next;
        break;
      }
      node2next = node2.next;
      node2.next = node1next;
      node2 = node2next;
    }

    second = node2;
  }

    void printLL(Node head){
      Node temp = head;
      while(temp != null){
           System.out.print("--> "+temp.data);
           temp = temp.next;
      }
    }

    public static void main(String[] args){
        MergeAlternate merge = new MergeAlternate();
        Scanner sc = new Scanner(System.in);
        Node list1 = null, list2 = null;
        System.out.println("Enter the number of elements for I list: ");

        int size_one = sc.nextInt();

        System.out.println("Enter "+size_one+" elements: ");

        for(int i = 0; i < size_one; i++){
          list1 = merge.insert(sc.nextInt(), list1);
        }

        System.out.println("Enter the number of elements for II list: ");

        int size_two = sc.nextInt();

        System.out.println("Enter "+size_two+" elements: ");

        for(int i = 0; i < size_two; i++){
          list2 = merge.insert(sc.nextInt(), list2);
        }

        System.out.println("Entered lists are as follows: ");
        merge.printLL(list1);
        System.out.println();
        merge.printLL(list2);

        MergeAlternate.shuffleMerge(list1, list2);

        System.out.println();

        System.out.println("Resultant List is: ");

        merge.printLL(merge.first);

    }
}
