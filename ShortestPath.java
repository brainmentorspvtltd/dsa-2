public class ShortestPath {

    static void shortestAllPath(int graph[][]){
        //int arr[][]=new int[graph.length][graph[0].length];

        for(int k=0;k<graph.length;k++){
    
        for(int i=0;i<graph.length;i++){

            for(int j=0;j<graph.length;j++){

                int min=graph[i][j];
                 int min2=graph[i][k]+graph[k][j];
                 
                 if(min<min2){
                    graph[i][j]=min;
                 }
                 else{
                    graph[i][j]=min2;
                 }

            }
        }
    }

    }
    public static void main(String[] args) {
        
        int graph[][]={ {0,3,100,5},
                        {8,0,2,100},
                        {100,4,0,100},
                        {2,2,1,0}};

                        shortestAllPath(graph);

                        for(int i=0;i<graph.length;i++){
                            for(int j=0;j<graph.length;j++){
                                System.out.print(graph[i][j]+" ");
                            }
                            System.out.println();
                        }
    }
}
