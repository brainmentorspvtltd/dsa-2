public class RatInMaze {
    
    static boolean solveMaze(int [][]maze, boolean marker[][],int dx,int dy,int x, int y){

        if(x==dx && y==dy){
            return true;
        }

        if(x<0 || x==maze.length || y<0 || y==maze[x].length ||  maze[x][y]!=1  || marker[x][y]==true){
            return false;
        }
        else{

            marker[x][y]=true;
            if(solveMaze(maze, marker, dx, dy, x, y+1))
            return true;
            if(solveMaze(maze, marker, dx, dy, x+1, y))
            return true;
            if(solveMaze(maze, marker, dx, dy, x-1, y))
            return true;
           if(solveMaze(maze, marker, dx, dy, x, y-1))
            return true;

            marker[x][y]=false;
            
            return false;

        }

    }
    public static void main(String[] args) {
        
        int maze[][]={  {1,1,1,0,0},
                        {0,1,1,1,1},
                        {0,1,0,0,0},
                        {0,1,0,0,0},
                        {1,1,0,0,0},
                        {1,0,0,0,0},
                        {1,1,1,1,1}};
        boolean marker[][]=new boolean[7][5];
        int des_x=6;
        int des_y=4;

        int start_x=0;
        int start_y=0;

        if(solveMaze(maze,marker,des_x,des_y,start_x,start_y)==true)
        {
            for(int i=0;i<7;i++){
                for(int j=0;j<5;j++){
                    System.out.print(marker[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("no path possible");
        }
    }
}
