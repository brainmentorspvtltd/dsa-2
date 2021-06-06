public class GarbageCollection {
    GarbageCollection g=null;
    static void makeString(){
        // String s=new String("Brain mentors");

        GarbageCollection g1=new  GarbageCollection();
        GarbageCollection g2=new  GarbageCollection();
        GarbageCollection g3=new  GarbageCollection();
        g1.g=g2;
        g2.g=g3;
        g3.g=g1;

    }
    public static void main(String[] args) {


        makeString();

        //objects =>new keyword
        //String s="priya";
        String str=new String();

        str=null;//it is pointing nothing


        String str2=new String("neha");
        str2=new String("tree");



    }
}
