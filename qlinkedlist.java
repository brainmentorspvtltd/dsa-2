class LNode{
    int data;
    LNode next;

    LNode(int data){
        this.data=data;
    }
}

class queueLinkedList{

    LNode rear;
    LNode front;
    int size;

    queueLinkedList(){
        size=0;
        rear=null;
        front=null;
    }
    
    void enqueue(int data){
        LNode temp=new LNode(data);
        if(rear==null){
            rear=temp;
            front=temp;
            size++;
        }
        else{
            rear.next=temp;
            rear=rear.next;
            size++;
        }
    }
    int dequeue(){

        if(front ==null){
            new Exception("undeflow");
        }
        LNode temp=front.next;
        int data=front.data;
        front.next=null;
        front=temp;
        size--;
        return data;
    }

    int front(){
        if(front==null){
            new Exception("undeflow");
        }
        return front.data;
    }
    int rear(){
        if(rear==null){
            new Exception("undeflow"); 
        }
        return rear.data;
    }
    boolean isEmpty(){
        if(rear==null){
            return true;
        }
        else
        return false;
    }
    int getsize(){
        return size;
    }
}

public class qlinkedlist {
    public static void main(String[] args) {
        queueLinkedList q=new queueLinkedList();
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.dequeue();
    q.dequeue();
    System.out.println(q.getsize()+"...."+q.front());
    }
    
}









