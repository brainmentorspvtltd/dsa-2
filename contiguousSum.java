public class contiguousSum {

    static int[] findmaxArray(int arr[], int k){
        int leftIndex=0;
        int rightIndex=k-1;
        int sum =0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int newSum=sum;
        for(int i=k,j=0;i<arr.length;i++,j++){
             newSum=newSum-arr[j]+arr[i];
            if(newSum>sum){
                leftIndex=j+1;
                rightIndex=i;
                sum=newSum;
            }
        }
        return new int[]{leftIndex,rightIndex}; 
    }
//using prefix sum 


static int[] dynamicWindow(int arr[]){

    int left=0,right=0;

    int sum=0;
    int maxsum=sum;
    for(int i=0;i<arr.length;i++){
        
        sum+=arr[i];
        if(maxsum<sum){
            maxsum=sum;
            right=i;
        }
        else if(sum<0){
            sum=0;
            left=i+1;

        }
    }

return new int[]{left,right};
}
   public static void main(String[] args) {


    int arr[]={-8,2,6,8,-5,42,456,7,-4,66,56,-100};

    //   // int 4 size contiguous Sum

    //   int sum[]=findmaxArray(arr,5);
    int sum[]=dynamicWindow(arr);
       System.out.println(sum[0]+"  "+sum[1]);
   } 
}
