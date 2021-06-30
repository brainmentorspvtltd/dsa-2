package DynamicProgramming;

public class SubsetSum {

    static boolean doSubsetSum(int arr[], int mat[][], int sum){

    for(int i=1;i<mat[0].length;i++){
        mat[0][i]=0;
    }
    for(int i=0;i<mat.length;i++){
        mat[i][0]=1;
    }


    for(int i=1;i<mat.length;i++){
        for(int j=1;j<mat[i].length;j++){

            if(j<arr[i-1]){
                mat[i][j]=mat[i-1][j];
            }
            else if(j==arr[i-1]){
                mat[i][j]=1;
            }
            else if(j>arr[i-1]){
                if(mat[i-1][j]==1){
                    mat[i][j]=1;
                }
                else{
                    int diff=j-arr[i-1];
                    if(mat[i-1][diff]==1){
                        mat[i][j]=1;
                    }
                    else{
                        mat[i][j]=0;
                    }
                }
            }
        }
    }
        if(mat[mat.length-1][sum]==1)return true;
        else{return false;}
    

    } 
    public static void main(String[] args) {
        int arr[]={1,3,5,2};
        int sum=7;

        int mat[][]=new int[arr.length+1][sum+1];

        boolean flag=doSubsetSum(arr,mat,sum);
        System.out.println(flag);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
