import java.util.*;
class CircularListDemo{
    Node head = null;
    Node tail = null;
    void insertAtBeg(int key){
        Node newnode = new Node();
        newnode.data=key;
        if(head==null){
            head=newnode;
            tail = newnode;

        }
        else{

            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }


    }
    void traverse(){
        Node temp = head;
        do{
            System.out.print("   "+temp.data);
              temp=temp.next;
        }while(temp!=head);

    }
    void insertatpos(int pos,int key){
        Node temp =head;
        Node newnode = new Node();
        Node temp2 = null;
        newnode.data = key;
        int i=0;
        while(i<pos-2){
            temp=temp.next;
            i++;
        }
        temp2 = temp.next;
        temp.next = newnode;
        newnode.next = temp2;


    }
    void deleteatpos(int pos){
        Node temp = head;
        int i=0;
        while(i<pos-2){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }
    public static void main(String[] args) {
        CircularListDemo obj = new CircularListDemo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            obj.insertAtBeg(sc.nextInt());

        }
        obj.traverse();
        System.out.print("Enter the position and  element to insert : ");
        obj.insertatpos(sc.nextInt(), sc.nextInt());
        obj.traverse();
        System.out.println();
        System.out.print("Enter the position to delete : ");
        obj.deleteatpos(sc.nextInt());
        obj.traverse();


    }
}
