public class Mcolor {

    static boolean canfill(int board[][],int arr[],int vertex,int color){
        if(arr[vertex]!=0)
        return false;
        for(int i=0;i<board.length;i++){
            if(board[vertex][i]==1){//connce
                    if(arr[i]==color){
                        return false;
                    }
            }
        }
        return true;
    }
    static boolean fillgraph(int board[][],int arr[],int n,int vertex){

        if(vertex==board.length){
            return true;
        }
        for(int i=1;i<=n;i++){
            if(canfill(board,arr,vertex, i)){
                arr[vertex]=i;

                if(fillgraph(board, arr, n, vertex+1))
                return true;

                arr[vertex]=0;

            }
            
        }
        return false;
    }
  public static void main(String[] args) {
      int board[][]={{0,1,1,0,0,0},
                     {1,0,0,1,1,0},
                     {1,0,0,0,0,0},
                     {0,1,0,0,1,0},
                     {0,1,0,1,0,1},
                     {0,0,0,0,1,0}};
      int arr[]=new int[board.length];
      int n=3;

      if(fillgraph(board,arr, n, 0)){
          for(int i=0;i<board.length;i++){
              System.out.println(i+" => "+arr[i]);
          }
      }

  }  
}
