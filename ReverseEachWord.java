public class ReverseEachWord {
    public static void main(String[] args) {
        String s="hello world is here";
        //olleh dlrow si ereh

        String strarr[]=s.split(" ");

        StringBuffer sbRes=new StringBuffer();
        for(String str:strarr){
            StringBuffer sb=new StringBuffer(str);
            sb=sb.reverse();
            
            sbRes.append(sb+" ");
        }

        System.out.println(sbRes);
    }
}
