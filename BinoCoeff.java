package DynamicProgramming;

public class BinoCoeff {
    static int binomialCoeff(int arr[][], int n,int r){

        if(arr[n][r]!=0){
            return arr[n][r];
        }
        if(n==r){
            arr[n][r]=1;
            return arr[n][r];
        }
        if(r==1){
            arr[n][r]=n;
            return arr[n][r];

        }

        arr[n][r]=binomialCoeff(arr, n-1, r-1)+binomialCoeff(arr, n-1, r);
        return arr[n][r];
    }
    public static void main(String[] args) {
        int n=6;
        int r=4;

        int arr[][]=new int[n+1][r+1];

     System.out.println( binomialCoeff(arr,n,r));
    }
}
