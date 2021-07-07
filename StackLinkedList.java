
// class Node{
//     int data;

//     Node next;
//     Node(int data){
//         this.data=data;
//     }
// }
// class Stack{

//     Node head;
//     int size=0;

//     void push(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             head=temp;
//             this.size++;
//         }
//         else{
//             temp.next=this.head;
//             this.head=temp;
//             size++;
//         }
//     }
//     void pop() throws Exception{
//         if(head!=null){
//         Node temp=head;
//         head=head.next;
//         temp.next=null;
//         size--;
//         }
//         else{
//            throw new Exception("underflow");
//         }
//     }
//     int peek() throws Exception{
//         if(head==null){
//             throw new Exception("underflow");
//         }
//         else{
//             return this.head.data;
//         }
//     }
//     int size(){
//         return this.size;
//     }
//     boolean isEmpty(){
//         return this.size==0?true:false;
//     }


// }
// public class StackLinkedList {
    
//     public static void main(String[] args) throws Exception {
//         Stack st=new Stack();
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);
//         st.pop();
//         st.pop();
//         System.out.println(st.peek());
//     }
// }
