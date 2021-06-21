public class ArraySum {
    static int sumArray(int arr[], int currentIndex,int sum){

            if(arr.length==currentIndex){
                return sum;
            }

            sum=sum+arr[currentIndex];

            // int result=sumArray(arr, currentIndex+1, sum);
            // return result;
            return sumArray(arr, currentIndex+1, sum);
    }

    static int sumArr(int arr[], int index){

        if(arr.length==index){
            return 0;
        }
        // int result=sumArr(arr, index+1);
        // result=result+arr[index];
        // return result;
        //return sumArr(arr, index+1)+arr[index];

        return arr[index] + sumArr(arr, index+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,534,5};
        System.out.println(sumArr(arr,0));
        //System.out.println(sumArray(arr,0,0));
    }
}
