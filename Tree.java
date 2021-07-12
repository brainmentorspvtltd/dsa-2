import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
class treeNode{
    int data;

    treeNode left;
    treeNode right;

    treeNode(int data){
        left=right=null;
        this.data=data;
    }
}
public class Tree {
    static void Inorder(treeNode root){

        if(root==null){
            return ;
        }
        else{
            Inorder(root.left);
            System.out.println(root.data);
            Inorder(root.right);
        }

    }
    static void preorder(treeNode root){

        if(root==null){
            return ;
        }
        else{
            System.out.println(root.data);
            preorder(root.left);
          
            preorder(root.right);
        }

    }
    static void InorderStack(treeNode root){

        Stack <treeNode>st=new Stack<treeNode>();


        while(root!=null || st.empty()!=true){

            //left
            while(root!=null){
                st.push(root);
                root=root.left;
            }

            root=st.pop();
            System.out.print(root.data+"  ");

            root=root.right;

        }

    }
    static void levelOrder(treeNode root){

        Queue<treeNode> q=new LinkedList<treeNode>();

        q.add(root);
        while(q.isEmpty()==false){
            treeNode temp=q.peek();
            q.remove();
            System.out.println(temp.data);

            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }

    static int  maxHeight(treeNode root){


        if(root==null){
            return 0;
        }

        int lefth=maxHeight(root.left);
        int righth=maxHeight(root.right);

        if(lefth>righth){
            return lefth+1;
        }
        else{
            return righth+1;
        }

    }
    
static int numberNodes(treeNode root){

    if(root==null){
        return 0;
    }
    else{
        int left=numberNodes(root.left);
        int right=numberNodes(root.right);
        return left+right+1;
    }
}

static int maxEle(treeNode root){
    if(root ==null ){
        return Integer.MIN_VALUE;
    }
    else{
        int left=maxEle(root.left);
        int right=maxEle(root.right);
        if(root.data>left && root.data>right)
        return root.data;
        else if(left>right && left>root.data){
            return left;
        }
        else{
            return right;
        }
    }

}

static void levelk(treeNode root , int k){
    if(root==null){
        return ;
    }
    if(k==1){
        System.out.print(root.data+"  ");
            return;
    }
        levelk(root.left, k-1);
        levelk(root.right, k-1);    

}
static treeNode insertBinary(treeNode root,int data){
    treeNode temp=new treeNode(data);
    if(root==null){
        return temp;
    }
    else{
        Queue<treeNode> q=new LinkedList<treeNode>();
        treeNode r=root;
        q.add(r);
        while(q.isEmpty()==false){
            treeNode curr=q.peek();
            q.remove();
            if(curr.left!=null){
                q.add(curr.left);
            }
            else{
                curr.left=temp;
                return root;
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            else{
                curr.right=temp;
                return root;
            }
        }
    }
    return null;
}
    public static void main(String[] args) {
        
        treeNode root=null;

        treeNode temp=new treeNode(10);
        root=temp;
        root.left=new treeNode(20);

        root.right=new treeNode(30);

        root.left.left=new treeNode(40);
        root.left.right=new treeNode(50);

        root.right.left=new treeNode(60);
        root.right.right=new treeNode(70);


       // preorder(root);
        
       // InorderStack(root);
       //System.out.println(maxHeight(root));
       //System.out.println(numberNodes(root));
    //    System.out.println(maxEle(root));
    // levelk(root, 2);
    insertBinary(root,80);
    insertBinary(root,90);
    levelOrder(root);
    }
}
