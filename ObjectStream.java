import java.io.*;
//serialization and deserialization
//is-A

//String =>ser impl

class Human_ implements Serializable{
    int b;
    Human_(){
        b=10000;
    }
} 
class Person_ extends Human_ implements Serializable{
    private static final long serialVersionUID = 1L;
    int c;
    Human_ h;
    int a;
    String s;
    Person_(){
        h=new Human_();
        a=100;
        s=new String("priya");
    }
}
class Empl extends Person_{
    private static final long serialVersionUID = 1L;

    int data2=899999;
    int data=9089;
    transient long id;//auto generate =>object =>memory 
    int age;
    int salary;

    Empl(){
    
        id=90;
        //id=System.currentTimeMillis();
        age=90;
        salary=100;
    }
}
public class ObjectStream {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
       
        Empl e=new Empl();
        FileOutputStream fo=new FileOutputStream("notes",true);
        ObjectOutputStream oo=new ObjectOutputStream(fo);

        //ser
       oo.writeObject(e);

        FileInputStream fi=new FileInputStream("notes");
        ObjectInputStream oi=new ObjectInputStream(fi);

        //deser
        Empl r=(Empl)oi.readObject();

//transient =>default value =>file =>id=data
        System.out.println(r.age+"  "+r.salary+" "+r.a+" "+r.s+" "+r.h.b+" "+r.id);

       fo.close();
       oo.close();
        fi.close();
        oi.close();



       
        // FileInputStream fi=new FileInputStream(file)
        // ObjectInputStream oi=new ObjectInputStream(in)
    }
}
