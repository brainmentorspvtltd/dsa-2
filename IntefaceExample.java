
interface DataBase{

    final int a=90;
    String url="https://";
    void connect();
    void read();
    abstract public void print();
}
interface DataBase2{

    final int a2=90;
    String url2="https://";
    void connect();
    void read();
    abstract public void print();
}
class Third implements DataBase , DataBase2{
//now connect fucntion and read function  will have only one definition and
//hence there wont be any ambiguity
//whereas with extends if two class carrying same function would have been 
//inherited then ambiguity.
    public void connect(){

    }
    public void read(){

    }
    public void print(){

    }
}
//interfaces =>no objects
//function abstract public 
//fields => static final
abstract class  StudentRecord implements DataBase{
    // void connect();
    // void read();
    // abstract public void pritn();
}

public class IntefaceExample {
   public static void main(String[] args) {
        String a=DataBase.url;   
        Third t=new Third();   
   } 
}
