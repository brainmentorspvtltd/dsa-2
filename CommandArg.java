public class CommandArg {
   public static void main(String[] arr) {
       int sum=0;
       for(int i=0;i<arr.length;i++){
           int number=Integer.parseInt(arr[i]);
           sum=sum+number;
       }
       System.out.println(sum);
    //System.out.println(arr[0]+arr[1]);
    // int firstNumber =Integer.parseInt(arr[0]);
    // int secondNumber=Integer.parseInt(arr[1]);

   // System.out.println(firstNumber+secondNumber);
       //length property is used ton get the length of an array
    //    for(int i=0;i<arr.length;i++){
    //        System.out.println(arr[i]);
    //    }
       //String s="this is my string";
       // int a[]={1,2,3,4,4};
       //System.out.println(a);
   } 
}
