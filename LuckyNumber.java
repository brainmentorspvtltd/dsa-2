public class LuckyNumber {
    
}
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
     List<Integer> luckyList=new ArrayList<Integer>();
       // int List<Integer> maxCol=new ArrayList<Integer>();
        int min=0;
        for(int i=0;i<matrix.length;i++){
            min=matrix[i][0];
            int colnumber =0;
            for(int j=1;j<matrix[i].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    colnumber=j;
                }
                
            }
            int max=matrix[i][colnumber];
            boolean flag=true;
            for(int k=0;k<matrix.length;k++){
                if(max<matrix[k][colnumber]){
                    flag=false;
                    break;
                }
            }
            
            if(flag==true){
                luckyList.add(max);
            }
           
           
        }
        
        
        return luckyList;
        
    }
}