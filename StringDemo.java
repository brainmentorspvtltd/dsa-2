//it is array of characters
//It is one of the most important data type
//websites, product details=>data base(String)
//g4geeks =>articles=>string
//facebook, in=>social media apps=>details=>string
//websites are human readable=>string 

//phone=>string 
//String => reference data type
//String =>final=>inherit=>methods 
//why String class???=>char arr[]=>functionality
//library =>because it has a lot of methods
//string is immutable=>once created an object can not be changed
//it cannot be changed
public class StringDemo {
public static void main(String[] args) {

    

    //there is no function=> synchronized
    StringBuilder stb=new StringBuilder("treerer");
    //mutable string 
    //functions=>synchronized=>locked=>one thread will be able to access the function
    //synchronized =>thread
    //char array
    // StringBuffer welcome=new StringBuffer("welcome to home Page");
   
    // System.out.println( welcome.charAt(3));
    // StringBuffer sb=new StringBuffer();
    // System.out.println("capacity : "+sb.capacity()+" length : "+sb.length());
    // sb.append("hello");
    // System.out.println("capacity : "+sb.capacity()+" length : "+sb.length());
    // sb.append("hello world hello");
    // System.out.println(sb);
    // System.out.println("capacity : "+sb.capacity()+" length : "+sb.length());
    // // sb.append(sb);
    // // System.out.println("capacity : "+sb.capacity()+" length : "+sb.length());
    // sb.append("ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
    // System.out.println("capacity : "+sb.capacity()+" length : "+sb.length());
    // sb.append("rrt");
    // System.out.println("capacity : "+sb.capacity()+" length : "+sb.length());
//capacity=> 16
//34=>16*2+2=32+2
//70=>34*2+2=>68+2
//once the capacity is crossed =>
//capacity*2+2
    //capacity
    //CharSequence=>interface
    // StringBuffer sb2=new StringBuffer("hello");
    // StringBuffer sb3=new StringBuffer(40);
    



    //string literal
    // int a=89;
    //examples=>
    //String searchKey="mobile"
    //String price="1000"
    //popularity
    //brand
    //... 
    //"Select * from product where name ="+SearchKey;
    //amazon =>
    
    // String str1="hello".intern();//obj-1
    // String str2="hello";//obj-2

    // String str3=new String("hello").intern();//object using new =>conventional style
    // String str4="hello2";
    // 2 object
    //object created =one
    // System.out.println(str1);    
    // System.out.println(str2); 
    // System.out.println(str3);
    // System.out.println(str1==str2);//object ref object values
    // System.out.println(str1==str3); 
    // System.out.println(str1.hashCode());
    // System.out.println(str2.hashCode());
    // String str5="hello";
    // String str6=str5;
    // str5=str5+" world";

    // System.out.println(str5);
    // System.out.println(str6);
//string thread safe=>read write=>new object 

    
}    
}
