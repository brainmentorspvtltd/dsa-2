import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //silent listen =anagrams =>samae repeat combination


        String s="listen";
        String s2="silent";

        char ch1[]=s.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(ch1.length!=ch2.length){
            System.out.println("not anagrams");
        }
        else{
            int flag=0;
        for(int i=0;i< ch1.length;i++){
                if(ch1[i]==ch2[i]){
                    continue;

                }
                else{
                    flag=1;
                    break;
                }
        }
        if(flag==1){
            System.out.println("not Anagram ");
        }
        else{
            System.out.println("Anagram");
        }
    }
    }
}
