
public class Tree {

    static int val=0;
    static void print(int n){
        if(n==0){
            return ;
        }

        else{
        
            System.out.println(n);
            print(n-1);
            print(n-1);
            print(n-1);
        }
    }
static     void printtree(int n,int level){

        if(n==level){
            return;
        }
        else{
            val++;
            int nodenumber=val;
           
           //left root right
             // printtree(n, level+1);
            // System.out.println(nodenumber);//
            // printtree(n, level+1);

            //root left right
             // System.out.println(nodenumber);//
             // printtree(n, level+1);
            // printtree(n, level+1);
           
             //left right root
            // printtree(n, level+1);
            // printtree(n, level+1);
            // System.out.println(nodenumber);//
           

        }

    }

    static int  fibo(int n){
        if(n==0 ||n==1){
            return n;
        }
        else{

            int term1=fibo(n-1);
            int term2=fibo(n-2);
            int thisTerm=term1+term2;
            return thisTerm;
        }

    }
static int counter=0;
static void stairCase(int totalStep, int currentstep,int maxStep){

    if(currentstep>totalStep){
        return;
    }
    else if(currentstep ==totalStep){
        counter++;
        return;
    }
    else{
    for(int i=1;i<=maxStep;i++){
        stairCase(totalStep, currentstep+i, maxStep);
    }
}

}

    public static void main(String[] args) {
       //stair ccase

    stairCase(5,0,3);
    System.out.println(counter);  
        // print(3);

       //printtree(4, 0);
    //    fibo(3);
    }
}
