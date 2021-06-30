public class nQueens {
    static boolean isPossible(int board[][],int row,int col){

        for(int i=0;i<=row;i++){
            if(board[i][col]==1){
                return false;
            }
        }
//left diag
        for(int i=row, j=col;i>=0 && j>=0 ; i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }

//right diag
       for(int i=row, j=col;i>=0 && j<=3;i--,j++){
        if(board[i][j]==1){
            return false;
        }
       }
       return true;
    }
    static boolean fillNqueen(int board[][], int row, int QueenNumber){

        if(row==4){
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(board[i][j]+"  ");
                }
                System.out.println();
            }
            System.out.println();
            return true;
        }
        for(int i=0;i<4;i++){
            if(isPossible(board,row,i))
            {   
                board[row][i]=QueenNumber;
                
                if(fillNqueen(board, row+1, QueenNumber)){
                    //return true;
                }
                else{
                    board[row][i]=0;
                }

            }
        }
        return false;

    }
    public static void main(String[] args) {
        int board[][]=new int[4][4];
        fillNqueen(board, 0,1);
        // if(fillNqueen(board, 0,1)){
        //     for(int i=0;i<4;i++){
        //         for(int j=0;j<4;j++){
        //             System.out.print(board[i][j]+"  ");
        //         }
        //         System.out.println();
        //     }
        // }
        // else{
        //     System.out.println("no possible solution");
        // }
    }
}






















