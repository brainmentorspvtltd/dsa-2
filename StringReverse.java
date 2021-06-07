import java.util.Scanner;

public class StringReverse {

    static void reverse(String str){
        //charAt
        //way -1
        // char ch[]=str.toCharArray();
        // for(int i=0,j=ch.length-1;i<ch.length/2;i++){
        //     char c=ch[i];
        //     ch[i]=ch[j];
        //     ch[j]=c;
        // j--;
        // }

        // String s=new String(ch);
        // System.out.println(s);
       // way2
        // StringBuilder strb=new StringBuilder(str);
        
        // strb.reverse();
        // System.out.println(strb);

        //ways 3

        byte br[]=str.getBytes();
        for(int i=0 , j=br.length-1;i<(br.length)/2;i++){
            byte c=br[i];
                br[i]=br[j];
                br[j]=c;
             j--;
        }
        // for(int i=0;i<br.length;i++){
        //     System.out.println(br[i]);
        // }
         System.out.println(new String(br));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        reverse(str);
    }
}
