/**
 *Node class, which holds data and contains next which points to next Node, previous which points to the previous Node.
 */
class Node {
    public int data; // data in Node.
    public Node next; // points to next Node in list.
    public Node previous; // points to previous Node in list.

    /**
     * Constructor
     */
    public Node(int data){
           this.data = data;
    }

    /**
     * Display Node's data
     */
    public void displayNode() {
           System.out.print( data + " ");
    }
}
