// Program to Re-arrange linked list to alternate min max elements
import java.util.Scanner;
class RearrangeList {
  /*
   * It rearrange the Linked list inplace
   */
  public Node rearrangeList(Node head) {
    if(head == null || head.next == null) {
      return head;
    }

    head = sortLinkedList(head);

    Node middleNode = getMiddleNode(head);
    Node nextList = middleNode.next;
    middleNode.next = null;

    Node reversedList = reverse(nextList);
    Node firstList = head;

    Node finalList = new Node();
    Node node = finalList;

    while(firstList != null || reversedList != null) {

      if(firstList != null) {
        node.next = firstList;
        node = node.next;
        firstList = firstList.next;
      }

      if(reversedList != null) {
        node.next = reversedList;
        node = node.next;
        reversedList = reversedList.next;
      }
    }

    return finalList.next;
  }

  public Node sortLinkedList(Node node) {
    if(node == null || node.next == null) {
      return node;
    }

    Node middle = getMiddleNode(node);
    Node second = middle.next;
    middle.next = null;

    return mergeTwoList(sortLinkedList(node), sortLinkedList(second));
  }

  public Node mergeTwoList(Node first, Node second) {
    if(first == null && second == null) {
      return null;
    }

    Node tmp = new Node();
    Node finalList = tmp;
    while(first != null && second != null) {
      if(first.data < second.data) {
        tmp.next = first;
        first = first.next;
      } else  {
        tmp.next = second;
        second = second.next;
      }

      tmp = tmp.next;
    }

    tmp.next = (first != null) ? first : second;

    return finalList.next;
  }

  public Node getMiddleNode(Node node) {
    Node slow, fast;

    slow = fast = node;

    while(fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public Node reverse(Node node) {
    if(node == null || node.next == null) {
      return node;
    }

    Node prev, next;
    prev = next = null;

    while(node != null) {
      next = node.next;
      node.next = prev;
      prev = node;
      node = next;
    }

    return prev;
  }

  /*
   * getNewNode() method to generate a new node
   */
  public Node getNewNode(int key) {
    Node a = new Node();
    a.next = null;
    a.data = key;
    return a;
  }

  /*
   * insert method is used to insert the element in Linked List
   */
  public Node insert(int key, Node node) {

    if (node == null)
      return getNewNode(key);
    else
      node.next = insert(key, node.next);

    return node;
  }

  /*
   * It'll print the complete linked list
   */
  public void printList(Node node) {
    if (node == null) {
      return;
    }

    System.out.print(node.data + " ");
    printList(node.next);
  }

  public static void main(String[] args) {
    RearrangeList list = new RearrangeList();

    Node head = null;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of given linked list: ");
    int size = sc.nextInt();

    System.out.println("Enter "+size+" elements: ");

    for(int i = 0; i < size; i++){
          head = list.insert(sc.nextInt(), head);
    }

    Node minMaxLinkedList = list.rearrangeList(head);

    System.out.println("Re-arranged list is: ");
    
    list.printList(minMaxLinkedList);

  }

}
