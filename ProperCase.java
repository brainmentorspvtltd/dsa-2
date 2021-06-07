public class ProperCase {

    static String makeProper(String s){
        if(!(s.charAt(0)<='Z' && s.charAt(0)>='A')){
            String s2=""+s.charAt(0);
            s2= s2.toUpperCase();
            s=s2+s.substring(1);
        }
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)<='z' && s.charAt(i)>='a'){
                continue;
            }
            else{
                String s3=(s.charAt(i)+"");
                s=s.substring(0, i)+s3.toLowerCase()+s.substring(i+1);
            }
        }
        return s;
    }
    static void checkProper(String str1){

        String strarr[]=str1.split(" ");

        for(int i=0;i<strarr.length;i++){
            System.out.println( makeProper(strarr[i]));

        }
        
       // return true;
    }

    //This Is An Example Of Proper Case.
    public static void main(String[] args) {
        String str="heLLo world";
        //check
        checkProper(str);
           
    }
}
