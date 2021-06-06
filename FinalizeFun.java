import java.io.File;

//finalize() they are keywords
//they are like destructors in cpp
//object creation =>object is created and default values are
//assigned to it 
//constructors
//do they actually construct object?????=>
//file =>open abc.txt=>object 
//read=>data read and count characters =>t's a's ......

//write
/*class FileHan{
    File obj;
    write(){}
    read(){}
}
user1=>abc.txt
user2
user3

user 1 task complete=>object kill
//just before killing the object=> file close
//clean up =>finalize() method
*/

class HandleFile{
    File file;
    void read(){
        System.out.println("iam reading this file");
        
    }

    @Override
    public void finalize(){
        //file closing, network close 

        file.delete();
        System.out.println("just before killing the object i run");
    }

}
public class FinalizeFun {
    public static void main(String[] args) {
        HandleFile f=new HandleFile();
        f.file=new File("Loops.java");
        f.read();        
    }   
}
//final, finalize(), finally