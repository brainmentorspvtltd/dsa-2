class DNode{
    int data;


    DNode prev;
    DNode next;

    DNode(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DNode head=new DNode(20);
        DNode second=new DNode(30);
        DNode third =new DNode(40);

        // head.prev=null;
        // head.next=second;
        // second.prev=head;

        // second.next=third;
        // third.prev=second;
        // third.next=null;

        head.prev=third;
        head.next=second;
        second.prev=head;

        second.next=third;
        third.prev=second;
        third.next=head;
        
        System.out.println(head.next.next.next.next.next.data);


    }
}
