public class Palindrome {
  //javaj
  static boolean isPalindrome(String s1){

    for(int i=0,j=s1.length()-1;i<s1.length()/2;i++,j--){
        if(s1.charAt(i)==s1.charAt(j)){
            continue;
        }
        else{
            return false;
        }
    }
    return true;
  }
  public static void main(String[] args) {
      String s1="javac";
      String s2="javaj";

      System.out.println(isPalindrome(s1));
      System.out.println(isPalindrome(s2));
  }  
}
