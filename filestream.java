import java.io.*;
public class filestream {
 public static void main(String[] args)throws IOException, FileNotFoundException {
    
    String path="notes";
    File f=new File(path);

    //reading from the file
    FileInputStream fi=new FileInputStream(f);
    BufferedInputStream bi=new BufferedInputStream(fi);
    // int ch=fi.read();
    //     while(ch!=-1){
    //         System.out.print((char)ch);
    //         ch=fi.read();
    //     }
    
    int ch=bi.read();
    while(ch!=-1){
        System.out.println((char)ch);
        ch=bi.read();
    }
        
        FileOutputStream fo=new FileOutputStream(f, true);
        BufferedOutputStream bo=new BufferedOutputStream(fo);
        // String s="this is a test string ";
        // byte []b=s.getBytes();
        // fo.write(b);
        // fo.write('a');
        
        String s="this is a test string ";
        byte []b=s.getBytes();
        bo.write(b);
        bo.write('a');


        fo.close();
        fi.close();
        bi.close();
        bo.close();
    }  
}
