public class subsetSum {
    static boolean doSubsetSum(int arr[],int currentSum,int index,int sum){
        
        if(currentSum>sum){
            return false;
        }

        if(sum==currentSum){
            return true;
        }
        if(index==arr.length){
            return false;
        }
        for(int i=index+1;i<arr.length;i++){
            if(doSubsetSum(arr, currentSum+arr[i], i, sum)){
                return true;
            }
            else{

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,5,14,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        if(sum%2==0){
            sum=sum/2;
            boolean result=doSubsetSum(arr,0,-1,sum);
            if(result==true){
                System.out.println("yes subsets possible");
            }
            else{
                System.out.println("No subsets possible"); 
            }
        }
        else{
            System.out.println("not possible");
        }
    }
}
