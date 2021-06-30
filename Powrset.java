public class Powrset {
    static void powerSet(String s, int index,String ans){

        System.out.println(ans);
        for(int i=index+1;i<s.length();i++){
            powerSet(s, i, ans+s.charAt(i));
        }
    }
   public static void main(String[] args) {
       String s="abcd";

       powerSet(s,-1,"");
   } 
}
