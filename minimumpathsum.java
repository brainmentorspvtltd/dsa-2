class Solution {
    public int minPathSum(int[][] grid) {
        
        //1st row
        for(int i=1;i<grid[0].length;i++){
                grid[0][i]=grid[0][i-1]+grid[0][i];            
        }
                //1st column
        for(int i=1;i<grid.length;i++){
            grid[i][0]=grid[i-1][0]+grid[i][0];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                
            if(grid[i-1][j]<grid[i][j-1]){
                grid[i][j]=grid[i][j]+grid[i-1][j];
            }
                else{
                    grid[i][j]=grid[i][j]+grid[i][j-1];
                }
                
            }    
        }
        return grid[grid.length-1][grid[0].length-1];
//         int arr[][]=new int[grid.length][grid[0].length];
//         arr[0][0]=grid[0][0];
//         //1st row
//         for(int i=1;i<grid[0].length;i++){
//                 arr[0][i]=arr[0][i-1]+grid[0][i];            
//         }
//         //1st column
//         for(int i=1;i<arr.length;i++){
//             arr[i][0]=arr[i-1][0]+grid[i][0];
//         }
        
//         for(int i=1;i<arr.length;i++){
//             for(int j=1;j<arr[0].length;j++){
                
//             if(arr[i-1][j]<arr[i][j-1]){
//                 arr[i][j]=grid[i][j]+arr[i-1][j];
//             }
//                 else{
//                     arr[i][j]=grid[i][j]+arr[i][j-1];
//                 }
                
//             }    
//         }
        
//         return arr[arr.length-1][arr[0].length-1];
        
        
    }
}
