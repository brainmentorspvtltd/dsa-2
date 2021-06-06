//consversion of data types
//int long =>type casting
//int =long => upcasting 
///long =>int=>downcasting 


//ref variable =>parent =>child 
//parent ref=>child object
//child ref =>parent object

class Shape{
   double area;
   int peri;
   int radius;
   Shape(){

   }
   double getArea(){
      return 0;
   }
}

class Square extends Shape{
   int length;
   Square(int length){
      this.length=length;
   }
   double getArea(){
      this.area=this.length*this.length;
      return this.area;
   }
}

class Circle extends Shape{
   int radius;
   Circle(int radius){
      this.radius=radius;
   }
   double getArea(){
      
      return 3.14*(this.radius*this.radius);
   }
}

//Every class in java is dirsctly or indirectly a child class of Object class

public class UpcastingDowncasting {
   public static void main(String[] args) {

     // Rule 1: there should always be some relation =>child=>parent 
     //compile time cehck
     //there is no relation between str and strbfr
      // String str =new String("abcd");
      // StringBuffer sb=(StringBuffer)str;
      
   //Rule 2: Assignment is not possible =>(compile time problem )
      // String s=new String("abcd");
      // StringBuffer sv=(String)s;//StringBuffer if we would have a parent or same class as String 

     // Rule 3: actually casting =>object =>relation should be there
   //   Object obj=new String("abcd");
   //   StringBuffer str=(StringBuffer)obj;

      Object obj=new String("abcd");//=>string 
      String s=(String) obj;//child class


        Shape sh=new Circle(12);
       Circle c=(Circle)sh;

         // Shape s=new Square(4);//parent class ref =>child class object //up casting

         // //System.out.println(s.length);
         // System.out.println(s.area);
         // System.out.println("Area of the Square = "+s.getArea());


         // Object o =new String("ABCD");
         // String s2=(String)o;

       
       
         // c.radius=45;
         //System.out.println(c.area+c.peri+c.radius);
         //child =>parent
         //int=>(int )long         

   } 
}
