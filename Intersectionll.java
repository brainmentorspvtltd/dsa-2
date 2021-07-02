public /**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) {
*         val = x;
*         next = null;
*     }
* }
*/
public class Solution {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
       ListNode temp=headA;
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=headA;
       
       ListNode fast=headB;
       ListNode slow=headB;
       
       boolean flag=false;
       while(fast!=null && fast.next!=null ){
           fast=fast.next.next;
           slow=slow.next;
           if(slow==fast){
               flag=true;
               break;
           }
       }
       if(flag==true){
           slow=headB;
           while(slow!=fast){
               slow=slow.next;
               fast=fast.next;
           }
           temp.next=null;
           return slow;
       }
       if(flag==false){
           temp.next=null;
           return null;
       }
       
       
       return null;
       
       
//         ListNode temp1=headA;
//         ListNode temp2=headB;
//         int len1=0,len2=0;
//         while(temp1!=null){
//             len1++;
//             temp1=temp1.next;
//         }
//         while(temp2!=null){
//             len2++;
//             temp2=temp2.next;
//         }
      
//          len1-=len2;
//         if(len1<0){
//             len1=len1*-1;
//             while(len1>0){
//                 len1--;
//                 headB=headB.next;
//             }
//         }
//         else{
//             while(len1>0){
//                 len1--;
//                 headA=headA.next;
//             }
//         }
       
//         while(headA!=null && headB!=null){
           
//             if(headA==headB){
//                 return headA;
//             }
           
//             headA=headA.next;
//             headB=headB.next;
//         }
       
       
//         return null;
   }
}



class Intersectionll {
    
}
