
public class BinarySearch {

    static int BinarySearching(int arr[], int key, int low , int high){

        if(low>high)
        return -1;
S
        int middle=low+(high-low)/2;

        if(arr[middle]==key){
               return middle; 
        }
        else if(arr[middle]<key){
            return BinarySearching(arr, key, middle+1,high);
        }
        else if(arr[middle]>key){
            return BinarySearching(arr, key, low,middle-1);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int key=17;

    int index=    BinarySearching(arr,key,0,arr.length-1);
    System.out.println(index);
    }
}
