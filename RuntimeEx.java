public class RuntimeEx {
  //jvm communication=>Runtime class
//factory method
  RuntimeEx getRTime(){
      RuntimeEx r=new RuntimeEx();
      return r;
  }
  public static void main(String[] args) {
     // System.gc();

     
    //runtime =>singleton class =>one object possible   
    Runtime runobj=Runtime.getRuntime();
    //egtRuntime= factory method=> method return object of same class
    System.out.println("initial memory :  "+((runobj.totalMemory()-runobj.freeMemory())/(8*1024)));

    for(int i=0;i<6000;i++){
        String s=new String("hello"+i);
    }
    System.out.println("free memory :  "+runobj.freeMemory());
    System.out.println("used memory :  "+((runobj.totalMemory()-runobj.freeMemory())/(8*1024)));

    runobj.gc();
    System.out.println("free memory :  "+runobj.freeMemory());
    
}  
}
