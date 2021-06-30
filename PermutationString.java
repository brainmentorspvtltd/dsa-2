public class PermutationString {
    static void permuteString(int length, String option , String ans){
        if(ans.length()==length){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<option.length();i++){
           String newAns=ans+option.charAt(i);
            String newOption=option.substring(0,i)+option.substring(i+1);
            permuteString(length, newOption, newAns);
            //permuteString(length, newOption, ans+option.charAt(i));
        }
    }
    public static void main(String[] args) {
        String option="abcdefgh";
        permuteString(3,option,"");
    }
}
