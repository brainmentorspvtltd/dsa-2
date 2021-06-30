// public class knigntTour {
    
//    static boolean Knight_tour_solver(int board[][], int x, int y, int step){

//     if(step==65){
//         return true;
//     }
//         if(x<0 ||y<0 ||x>=8 ||y >=8 || board[x][y]!=0){
//             return false;
//         }
//         else{
            
//             int arrx[]={2,1,-1,-2,-2,-1,1,2};

//             int arry[]={1,2,2,1,-1,-2,-2,-1};
//             board[x][y]=step;
//             for(int i=0;i<8;i++){
                
//             if(Knight_tour_solver(board,x+arrx[i],y+arry[i],step+1)==true){
//                 return true;
//             }
           
//             }
//             board[x][y]=0; 
//             return false;
//         }
//         //return false;
//     }
//     public static void main(String[] args) {
//         int board[][]=new int[8][8];

//         int step=1;

//         if(Knight_tour_solver(board, 0,0,step)){
//             for(int i=0;i<8;i++){
//                 for(int j=0;j<8;j++){
//                     System.out.print(board[i][j]+"\t");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }


// [15:08] RISHITA  RAMOLA
class knightTour{
    static int n =1;
    static boolean tour(int[][] board,int x, int y){
        if(n== 65) {
            for(int i=0; i<8; ++i){
                for(int j=0;j<8;++j){
                    System.out.print(board[i][j] + "\t");
                }
                System.out.println();
            }
            return true;
        }

        if(x<0 || x >= board.length || y<0 || y>=board[x].length || board[x][y]!= 0 )
                return false;
        else
        {   board[x][y] = n++;
            if(tour(board,x-2,y-1))
                return true;
            if(tour(board,x-2,y+1))
                return true;
            if(tour(board,x-1,y-2))
                return true;
            if(tour(board,x-1,y+2))
                return true;
            if(tour(board,x+1,y-2))
                return true;
            if(tour(board,x+1,y+2))
                return true;
            if(tour(board,x+2,y-1))
                return true;
            if(tour(board,x+2,y+1))
                return true;
            board[x][y]=0;
            n--;
            return false;
        }

    }
    public static void main(String[] args){
        int board[][] = new int [8][8];
tour(board,0,0);
    }
}

