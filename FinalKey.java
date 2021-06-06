//Student=>objects
//value =>no change 

//public default
//final =>fix the definition=> data members, class , function
//data mem=>value change
//fumntion=>second function override 
//class=> you wont be able change that class, no inheritance

//if a class is final we cannot inherit this class
final class Student{
   final String board="CBSE";

   int rollno;

   void print(){
       System.out.println("print function of Student class");
   }
   final void setroll(int rollno){
       this.rollno=rollno;
   }
}
// class Standard2 extends Student{

// }

// class Standard1 extends Student{

// }

public class FinalKey{

    public static void main(String[] args) {
        Student s=new Student();
        // no problem in using the final variables with inheriTANCE
        s.setroll(78);
        s.print();
       // s.board="ICSE";        
    }
}