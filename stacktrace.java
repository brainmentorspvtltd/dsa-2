import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class stacktrace {
    static void doRead() throws IOException{
        System.out.println("iam in do read");
        //int a=90/0;
        //checked =>you have either req or handle i tyourself
        File f=new File("abc/dxt.txt");
        //file handling ,socket, sleep=>thread, interrupt 
        f.createNewFile();

        System.out.println("iam leaving");
    }
    static void doSomething() throws IOException{
        System.out.println("iam in do Something");
        //try{
        
        doRead();
        //}
        // catch(Exception e){
        //     System.out.println("iam helping do read");
        // }
        System.out.println("iam at the end of do something");
    }
public static void main(String[] args) throws IOException {
    
    // System.out.println("iam in main");
    // doSomething();
    // System.out.println("iam at the end of main");


    //examples of runtime exeption =>null pointer , arithmetic , ....(unchecked =>compiler will not not force you to handle)
    //resources of system =>api=>ioexception ,interrupt ,..FileNotfoundexc.....
    //Error=>we cannot handle such problem  
    //int a=100/0;
    try{
        // String s="abcd";
        // s=null;
        // s.length();
        int arr[]=new int[10];
        System.out.println(arr[100]);
    }
    catch(NullPointerException e){
        System.out.println("null exc");
    }
    catch(ArithmeticException a){
        System.out.println("arithmetic e");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("index out of bound");
    }
    catch(Exception e2){
        System.out.println("anonymous exception");
    }
    finally{
        System.out.println("finally");
    }


}
}
