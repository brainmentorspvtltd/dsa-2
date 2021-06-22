//1351
//not efficient
class Solution1 {
    
    
    
        int binarySearch(int arr[],int low, int high){
            // for(int a:arr){
            //     System.out.print(a);
            // }
            // System.out.println();
            if(low>high)
                return -1;
            int middle=low+(high-low)/2;
            
            if(arr[middle]<0 && middle==0){
                return middle;
            }
            else if(arr[middle]<0 && arr[middle -1]>=0 ){
                return middle;
            }
            else if(arr[middle]>=0){
               return binarySearch(arr,middle+1,high);
            }
            else if(arr[middle]<0){
                return binarySearch(arr,low,middle-1);
            }
            return -1;
            
        }
        public int countNegatives(int[][] grid) {
            
            
            ArrayList<Integer> list=new ArrayList<Integer>();
                
                for(int i =0;i<grid.length;i++){
                    
                    list.add(binarySearch(grid[i], 0,grid[i].length-1));
                    
                    
                }
            
            int counter=0;
            
            for(int i:list){
          System.out.println(i);
                if(i!=-1)
                counter+=(grid[0].length-i);
            }
            
            
            return counter;
        }
    }
    
    //efficient
    class Solution2 {
    
    
    
        int binarySearch(int arr[],int low, int high){
            // for(int a:arr){
            //     System.out.print(a);
            // }
            // System.out.println();
            if(low>high)
                return -1;
            int middle=low+(high-low)/2;
            
            if(arr[middle]<0 && middle==0){
                return middle;
            }
            else if(arr[middle]<0 && arr[middle -1]>=0 ){
                return middle;
            }
            else if(arr[middle]>=0){
               return binarySearch(arr,middle+1,high);
            }
            else if(arr[middle]<0){
                return binarySearch(arr,low,middle-1);
            }
            return -1;
            
        }
        public int countNegatives(int[][] grid) {
            
            
            ArrayList<Integer> list=new ArrayList<Integer>();
               int col=grid[0].length; 
            int counter=0;
                for(int i =0;i<grid.length;i++){
                   int column=col;
                   col=binarySearch(grid[i], 0,col-1);
                    if(col!=-1)
                            counter+=(column-col)*(grid.length-i) ;
                    if(col==-1)
                             col=column;
                    
                }
    
            
            return counter;
        }
    }
