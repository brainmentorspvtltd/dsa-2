import java.io.*;
//SAM=>single abstract Method
@FunctionalInterface
class MyFilter implements FilenameFilter{

    @Override
    public boolean accept(File dirName, String fileName) {
        // TODO Auto-generated method stub

        //System.out.println("dirname :"+dirName+"  filename :"+fileName);
       // return false;
        if(fileName.endsWith(".java"))
        return true;
        else{
            return false;
        }
    }
}

public class FileHandling {
  
public static void main(String[] args) throws IOException{
    String dirPath="C:\\Users\\ashis\\Documents\\group2dit";
        File f=new File(dirPath);

        //MyFilter filter=new MyFilter();
        //String arr[]=f.list(filter);

        //lambda expression
        //short hand=>interface with single function =>lambda expression
String arr[]=f.list((dirName,fileName)->fileName.endsWith(".java"));

String arr2[]=f.list((dirname,filename)->{
    if(filename.contains("ab"))
    return true;
    else{
        return false;
    }
});
        for(String s:arr2){
            System.out.println(s);
        }


     
    
    // File dir=new File(dirPath);

    // if(dir.exists() &&dir.isDirectory()){
        
    //     //String strarr[]=dir.list();
    //     File f[]=dir.listFiles();

    //     for(File fi:f){
    //         if(fi.isDirectory()){
    //             System.out.println(fi.getName());
    //             getFiles(fi);
    //         }
    //         else{
    //             System.out.println(fi.getName());
    //         }
    //     }
    // }

    // String path="notes";

    // File file=new File(path);

    // if(file.exists()){
    //     System.out.println(file.getAbsolutePath());
    //     System.out.println(file.getName());
    //     System.out.println(file.canRead());
    //     System.out.println(file.getParent());
    //     System.out.println(file.isFile());
    //     System.out.println(file.isDirectory());
    
    // }

    //absolute ,,relative=>
    // File dir=new File("abc/bcd");

    // if(dir.exists()){
    //     System.out.println("directory already there....");
    // }
    // else{
    //     dir.mkdir();
    //     System.out.println("folder created");
    // //    // File file=new File("abc/notes2");

    // //     if(file.exists()){
    // //         System.out.println("file alreay exists");
    // //     }
    // //     else{
    // //         System.out.println("file created......");
    // //        file.createNewFile(); 
    // //     }
    // }

   

}

  // static void getFiles(File f){
    //     //f ref =>directory

    //     File arr[]=f.listFiles();
    //     for(File fi:arr){
    //         if(fi.isDirectory()){
    //             System.out.println(fi.getName());
    //             getFiles(fi);
    //         }
    //         else{
    //             System.out.println(fi.getName());
    //         }
    //     }
    // } 
}
