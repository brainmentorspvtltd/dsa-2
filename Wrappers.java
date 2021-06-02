public class Wrappers {
    public static void main(String[] args) {

        //autoboxing
        Character object1='a';
        //unboxing
        char ch=object1;
        Character object2='r';
        System.out.println(object1);//auto unboxing
        System.out.println(object2.charValue());//explicitly telling to give the char value

        System.out.println("static variables of Wrapper class and present in all the wrapper classes");
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);

        // int primitiveInt=90;
        // //==
        // Integer firstInteger=new Integer(primitiveInt);
        // Integer secondInteger=primitiveInt;
        // secondInteger.compareTo(firstInteger);
       
        // System.out.println(firstInteger);
    }
}
