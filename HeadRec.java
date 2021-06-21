public class HeadRec {

    static void printNum(int n){

        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printNum(n-1);
        System.out.println(n);
        // if(n%2!=0)
        // System.out.println(n);
    }
    public static void main(String[] args) {
        printNum(5);
    }
}
