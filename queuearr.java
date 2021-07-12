class QOperation{
    int arr[];

    int rear;
    int front;
    QOperation(int k){
        arr=new int[k];
        front=-1;
        rear=-1;
    }

    void shift(){
        for(int i=front,j=0;i<arr.length;i++,j++){
            arr[j]=arr[i];
        }
    }
    void enqueue(int data){
        if(rear==arr.length-1){
            if(rear-front+1!=arr.length)
            shift();

            new Exception("queue full ");
        }

        rear++;
        arr[rear]=data;
        if(rear==0){
            front=0;
        }
    }

    int dequeue(){
        if(front==-1 ){
            new Exception("queue empty");
        }
        if(front==rear+1){
            front=-1;
            rear=-1;
            new Exception("queue emoty");
        }
        front++;
        return arr[front-1];

    }
    int getfront(){
        if(front==-1){
            new Exception("underflow");
        }
        return arr[front];
    }
    int getrear(){
        if(rear==-1){
            new Exception("underflow");

        }
        
         return arr[rear];
    }
    boolean isEmpty(){
        if(rear==-1 && front==-1){
            return true;
        }
        else{
            return false;
        }
    }

    int size(){
        if(rear==-1){
            return 0;
        }
        return rear-front+1;
    }
}
class queuearr{
public static void main(String[] args) {
    QOperation q=new QOperation(5);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    System.out.print(q.getfront()+  "......"+q.getrear());

}
}