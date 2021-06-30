package DynamicProgramming;

public class fibonacci {
    static int fibo2(int num,int arr[]){

        if(num==0){
            return 0;
        }
        if(arr[num]!=0){
            return arr[num];
        }
        arr[num]= fibo2(num-1, arr)+fibo2(num-2, arr);
        return arr[num];
    }
    static int fibo(int num, int arr[]){

        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int num=7;

        int arr[]=new int[8];
        arr[0]=0;
        arr[1]=1;

       System.out.println( fibo2(num,arr) );
    }
}


















