//abstraction=>
//Data base =>vendors data base write=>
//read
//data base=>address=>connect

/*abstract class Database{
    String connectId;//without connect id /url Database class doent have any significance
write(){

}
read(){

}
}
*/
abstract class Person{

    String name;
    int height;
    int weight;

//switch board => inteface=>internal wiring 
//whoever will connect with this socket can use this this socket
//all the function which abstract in nature we have to connect with all
//of them if we want to use this person
abstract void printInfo();
abstract void readInfo();
}

abstract class Employee extends Person{

    String eid;
    String officename;
//readInfo() is inherited but there is no definition
    void printInfo(){

    }
}

class Department extends Employee{
void readInfo(){

}
}


public class AbstractKey {
   public static void main(String[] args) {
       //Employee e=new Employee();
       Department d=new Department();
   } 
}
