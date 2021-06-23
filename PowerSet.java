import java.util.ArrayList;
import java.util.Iterator;
public class PowerSet {
    
   static  int powerSet(int arr[],int currIndex,ArrayList<ArrayList<Integer>> ref) throws Exception{
    System.out.println(ref);
    if(currIndex==arr.length-1){
        return 1;
    }
    int cnt=1;
  
    if(currIndex!=-1)
   // for(ArrayList<Integer> list:ref){
       // System.out.print(list);
      Iterator Iterator<ArrayList<Integer>> itr=ref.iterator();
        ArrayList<Integer> TempList=new ArrayList<Integer>();
      
        TempList.addAll(list);
        TempList.add(arr[currIndex]);
       
        ref.add(TempList);
        // System.out.println(TempList);
        System.out.println(ref);
    }
    else{
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(0);
        ref.add(list);
    }
    
    for(int i=currIndex+1;i<arr.length;i++){
        cnt+=powerSet(arr, i,ref);
    }
   
    return cnt;
   } 
public static void main(String[] args) throws Exception {
    int arr[]={1,2,3,4};
ArrayList<ArrayList<Integer>> ref=new ArrayList<ArrayList<Integer>>();

System.out.println(list);
    int counter=powerSet(arr,-1,ref);
    System.out.println(counter);
   for(ArrayList<Integer> a: ref){
       System.out.println(a);
   }
}

}
