import jdk.jfr.DataAmount;

class Node
{
    int data;
    String name;


    Node nextRef;

    Node(int data,String name){
        this.data=data;
        this.name=name;

        this.nextRef=null;
    }
}

class LinkedList{
    public static void printListRec(Node head){
        if(head==null)
        return ;
        System.out.print(head.data+"   => ");
        printListRec(head.nextRef);
    }
    public static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+"  ");
            head=head.nextRef;
        }
    }

    static Node insertStart(Node head, int data,String name){
        Node temp=new Node(data,name);

        temp.nextRef=head;
        head=temp;
        return head;
    }
    static Node insertIntoList(Node head,int data, String name){

        Node temp=new Node(data,name);

        if(head==null){
            head=temp;
            return head;
            //return temp;
        }
        else{

            while(head.nextRef!=null){
                head=head.nextRef;
            }

            head.nextRef=temp;

        }
        return head;


    }
    
    static public void insertAtkfromEnd(Node head, int k, int data, String name){

        Node cn=head;
        //length of ll
        int length=0;
        while(cn!=null){
            cn=cn.nextRef;
            length++;
        }

        k=length-k+2;
        InsertAtK(head, k, data, name);
    }
    static public void InsertKend2(Node head, int k,int data, String name){
        Node temp=new Node(data,name);
        Node first=head;
        while(k>1){
            first=first.nextRef;
            k--;
        }

        Node second=head;
        while(first.nextRef!=null){
            second=second.nextRef;
            first=first.nextRef;
        }


        temp.nextRef=second.nextRef;
        second.nextRef=temp;


    }
    static public Node InsertAtK(Node head, int k,int data, String name){
        
        Node h=head;
        if(k==1){
            return insertStart(head, data, name);
        }
        Node temp=new Node(data,name);
        while(  k>2){
         
                k--;
                head=head.nextRef;
        }
        temp.nextRef=head.nextRef;
        head.nextRef=temp;

        return h;

    }
    public static Node reverse(Node head, Node temp){
        if(temp==null){
            return head;
        }
       
        Node temp2=temp.nextRef;
        temp.nextRef=head;
        return reverse(temp,temp2);
        
    }
    public static boolean hasCycle(Node head) {
        
        
        Node fast=head;
        Node slow=head;
        
        while( fast!=null && fast.nextRef!=null ){
            fast=fast.nextRef.nextRef;
            slow=slow.nextRef;
            if(fast==slow){
                return true;
                
            }
        }
        return false;
        
        
    }
    static Node delete(Node head,int k){
        
        Node cn=head;
        Node temp=head;
        
       if(k==1){
        head=head.nextRef;
        cn.nextRef=null;
        cn=null;    
        return head;
        }
        k--;
       cn=cn.nextRef;
        while(k>1){
            cn=cn.nextRef;
            temp=temp.nextRef;
            k--;
        }
        temp.nextRef=cn.nextRef;
        cn.nextRef=null;
        cn=null;
        
        return head;

    }
    public static void main(String[] args) {
        
        // Node head=new Node(20,"abc");
        // Node second=new Node(40,"bcd");
        // Node third=new Node(60,"efg");
        // Node fourth =new Node(43,"lmn");
        
        // head.nextRef=second;
        // second.nextRef=third;
        // third.nextRef=fourth;
        // second=null;
        // third=null;
        // fourth=null;
        
        Node head=null;
        head=insertIntoList(head,20,"abc");
        insertIntoList(head,30,"abc");
        insertIntoList(head,40,"abc");
        insertIntoList(head,50,"abc");
        insertIntoList(head,60,"abc");
        insertIntoList(head,70,"abc");
        head=insertStart(head,80,"pqr");
       
        head=InsertAtK(head, 3,38,"rst");
        insertAtkfromEnd(head, 1, 23, "pqr");
        InsertKend2(head, 2, 100, "qws");
        head=delete(head, 1);
        printListRec(head);
       // printList(head);

        // System.out.println(head.data+" -> "+head.nextRef.data+" -> "
        // +head.nextRef.nextRef.data+" -> "+head.nextRef.nextRef.nextRef.data);
        // // System.out.println(second.data);
        // System.out.println(head.nextRef.data);


    }
}