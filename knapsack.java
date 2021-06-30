public class knapsack {

    static void fillmatrix(int matrix[][],int weights[], int profit[]){


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){

                if(i==0 || j==0){
                    matrix[i][j]=0;
                }
                else{
                    if(j<weights[i-1]){
                        matrix[i][j]=matrix[i-1][j];
                    }
                    else if(j>=weights[i-1]){

                        int diff=j-weights[i-1];
                       int newValue= profit[i-1]+matrix[i-1][diff];
                       int oldValue=matrix[i-1][j];
                       if(oldValue>newValue){
                           matrix[i][j]=oldValue;
                       }
                       else{
                           matrix[i][j]=newValue;
                       }

                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int weights[]={1,2,4,1};
        int profit[]={100,200,300,200};
        int maxWeight=5;
        int matrix[][]=new int[weights.length+1][maxWeight+1];

        fillmatrix(matrix, weights, profit);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
