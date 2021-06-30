//make a four digit binary number
public class BinaryNumber {
    
    static void formBinaryNumber(int length,String binary){

        if(binary.length()==length){
                System.out.println(binary);
                return ;//to stop the growth of the stack
        }

        formBinaryNumber(length,binary+0);
        formBinaryNumber(length,binary+1);
    }
    static void noOnesTogether(int length, String ans){

    }
    public static void main(String[] args) {
        

        int length=4;
       // formBinaryNumber(length,"");

       noOnesTogether(length,"");
    }
}
