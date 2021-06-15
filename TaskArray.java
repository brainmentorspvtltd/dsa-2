package array;

import java.util.ArrayList;
import java.util.Arrays;

import org.graalvm.compiler.nodes.java.ArrayLengthNode;

public class TaskArray {
    public static void reverse(int arr[]){
        //this function reverses an array=>arr1

        int start=0;
        int end=arr.length-1;

        for(;start<end;start++,end--){

            
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
    static void printingList(ArrayList<Integer>list){

        for(int a:list){
            System.out.print(a+"  ");
        }
        System.out.println();
    }
    static void printing(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void shiftRightByOne(int arr2[]){
 //6,1,2,3,4,5
 //approach 1

        // int temp= arr2[arr2.length-1];

        // //shifting
        // for(int i=arr2.length-2;i>=0;i--){
        //     arr2[i+1]=arr2[i];
        // }

        // arr2[0]=temp;

        for(int i=arr2.length-1;i>0;i--){
            // int temp=arr2[i];
            // arr2[i]=arr2[i-1];
            // arr2[i-1]=temp;

            arr2[i]=arr2[i]+arr2[i-1];
            arr2[i-1]=arr2[i]-arr2[i-1];
            arr2[i]=arr2[i]-arr2[i-1];

        }
    }
   static void shiftright(int []arr, int k){

    k=k%arr.length;

    //block shifting 
    int temp[]= new int[k];

    for(int i=arr.length-k,j=0;i<arr.length;i++,j++){
        temp[j]=arr[i];
    }

    for(int i=arr.length-k-1;i>=0;i--){
        arr[i+k]=arr[i];

    }

    for(int i=0 ;i<k;i++){
        arr[i]=temp[i];
    }


    }
    static void zigZag(int arr[]){
        
        int flag=0;
        //0=>smaller
        //1=>greter
        for(int i=0;i<arr.length-1;i++){

            if(flag==0){
            if(!(arr[i]<arr[i+1])){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            flag=1;
        }

       else if(flag==1){
            if(!(arr[i]>arr[i+1])){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
         flag=0;   
        }
        }
        
    }
    static ArrayList<Integer> findLeaders(int arr[]){

        ArrayList<Integer> list=new ArrayList<Integer>();
        int max=arr[arr.length-1];
        list.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        return list;

    }
    static ArrayList<Integer> leadersNaive(int arr[]){
        
        ArrayList<Integer> list=new ArrayList<Integer>();

        boolean leader=true;

        for(int i=0;i<arr.length;i++){
            leader=true;
            for(int j=i+1;j<arr.length;j++){

                if(arr[j]>arr[i]){
                    leader =false;
                    break;
                }
            }

            if(leader==true){
                list.add(arr[i]);
            }
        }
        
        
        return list;
    }

    static void findMissing_XOR(int arr[]){

        int result_1=0;
        for(int i=1;i<=arr.length+1;i++){
        result_1=result_1 ^ i;
        }

        int result_2=0;
        for(int i=0;i<arr.length;i++){
            result_2=result_2 ^ arr[i];
        }

        int result=result_1 ^ result_2;

        System.out.println(result);


    }
    static void pairSum_2pointers(int arr[],int sum){

        Arrays.sort(arr);

        // for(int a:arr){
        //     System.out.print(a+" ");
        // }
        int i=0, j=arr.length-1;
        for(;i<j;){
            if(sum==(arr[i]+arr[j])){
                System.out.println(arr[i]+" , "+arr[j]);
                i++;
            }
            else if(sum >(arr[i]+arr[j])){
                i++;
            }
            else if(sum < (arr[i]+arr[j])){
                j--;
            }
        }
    }
  public static void main(String[] args) {
    // int arr1[]={2,4,5,7,8,9,0,33};
    // printing(arr1);
    // reverse(arr1);
    // printing(arr1); 

    int arr2[]={1,2,3,4,5,6}; //right side rotation
    //6,1,2,3,4,5
    //5,6,1,2,3,4
    //4,5,6,1,2,3

    // printing(arr2);
    // int k=3;
    // for(int i=0;i<k;i++){
    // shiftRightByOne(arr2);  //=>O(nk)
    // }

    // printing(arr2);
    // shiftright(arr2,3);
    // //O(1), O(n)
    // printing(arr2);

    //shiftLeftByOne(arr2);
    //shiftLeft(arr2,3);


    //ZIG ZAG=>cond=>distinct elemnets
    //rearrange=> arr[0]<arr[1]>arr[2]<arr[3]>arr[4]<arr[5]>arr[6],,, < > < > < > < > < >
    // int arr4[]={4,3,7,8,6,2,1};
    // printing(arr4);
    // zigZag(arr4);
    // printing(arr4);
    //3,7,4,8,2,6,1   


    //Leaders in array
    //=>arr =>find out leader
    // [2,6,78,9,3,32,5,56,21,4]
    //leaders are=>78,56,21,4

    int arr5[]={2,6,78,9,3,32,5,56,21,4};
    printing(arr5);
   // ArrayList<Integer> list=leadersNaive(arr5);
    ArrayList<Integer> list=findLeaders(arr5);
    printingList(list);
          
    // right


    //first n natural=> one number is missing  
    //5
    //arr6[]={1,2,3,4,5,6};//7
    //int arr6[]={1,2,3,4,6,7};
    //traverse 
    //findMissing(arr6);//output => 5

    
    //(sum of first natural number) -  (sum of lements in array)
    int arr7[]={2,1,4,5,6,7,3};
    //findMissing_sum(arr7);

    //findMissing_hashing(arr7);
    //tech -3
    //sort array and then use findMissing()

    //tecch 4 Xor
    //0-0=>0 1-1=>0
    //0 xor 1->1  1 xor 0=> 1
    findMissing_XOR(arr7);


    //find the pair whose sum is equal to k
    //int arr8[]={4,2,5,8,9,2,1,4,8,3,0},k=8
    //pairSumNaive(arr,k);
    /*for(){//first
        for()//second
    }
    */
    //output=>{4,4}, {8,0},{5,3},{8,0}
     
    //technique =>sort
    //2 pointers
    int arr9[]={4,2,5,9,1,8,3,0};
    pairSum_2pointers(arr9,8);

    //pairSum_hash();






  }  
}











