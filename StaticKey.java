//static keyword can be used with classname data members and member function
//static keyword can be accessed using classname and object
//(sttaic)they are created as soon as class definition is loaded into memory


//main=> static
//static class StudentCollege
//private static protected
//final default and public
//static data is up for inheritance final class is not
class StudentCollege{
    //class specific
    static String collegeName;
    static int totalTitles=0;
    final static  String principal="Nilima";

    static{
        System.out.println("hello iam a static block");
    }
    //object specific 
    String name;
    int id;
    String phone;
    int portalId;
    int titles;

    void setTitle(){
        //Can we access static member function
        // or data member from non static block
        this.titles=this.titles+1;
        this.totalTitles+=1;
    }
    public final static void functioName(){
        System.out.println("hello iam static final block");
    }
    static int getTotalTitles(){
        //if accessing non static data member and member fucntion from static block
        //cannot access
        //this.name
        //StudentCollege.name;
        return StudentCollege.totalTitles;
    }
    StudentCollege(String name, int id,String phone, int portalId, int titles){
        this.name=name;
        this.id=id;
        this.phone=phone;
        this.portalId=portalId;
        this.titles=titles;

    }
    StudentCollege(){

    }
}

//static member =>are they inherited??
//yes,they are inherited
//StudentCollege to firstYear=>static member 
class FirstYear extends StudentCollege{

    static int getTotalTitles(){
      //  StudentCollege.totalTitles+29;
        FirstYear.totalTitles=90;
        return FirstYear.totalTitles;
    }
}

//JVM=>staticKey.main()
public class StaticKey {

    public static void main(String[] args) {
        StudentCollege.collegeName="abc  college";
        StudentCollege s=new StudentCollege();
        //StudentCollege tina=new StudentCollege("tina",1223,"2323-2323",12323,0);
        //System.out.println(tina.collegeName);
        
        // StudentCollege ram=new StudentCollege("Ram",1288,"23233-6773",8767,0);
        // tina.setTitle();
        // ram.setTitle();
        // tina.setTitle();
        // tina.setTitle();
        // tina.setTitle();

        // System.out.println("titles won by ram "+ram.titles);
        // System.out.println("tina "+tina.titles);
        // System.out.println("college titles" +StudentCollege.totalTitles);
        // System.out.println("college titles" +ram.totalTitles);
    }
}
