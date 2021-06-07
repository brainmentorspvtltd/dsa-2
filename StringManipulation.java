public class StringManipulation {
 public static void main(String[] args) {
     String str="hello";
     String str2="HELLO";
     String str3=new String("hello");
     String str4="helllo this is new world";
     System.out.println(str.charAt(1));
     System.out.println(str2.toLowerCase());
     System.out.println(str.toUpperCase());
     System.out.println(str.substring(1,3));//1 index->include 3=>excluded
     char arr[]=str.toCharArray();//{'h','e','l','l','o'}
     System.out.println(str.equals(str3));
     System.out.println(str2.equalsIgnoreCase(str3));
     System.out.println(str.contains("hi"));
     System.out.println(str.indexOf("ll9",1));
     String str5[]=str4.split(" ");
     for(String s:str5){
         System.out.println(s);
     }
    System.out.println(str.length());
    String s2="    heloo ";
    System.out.println(s2);
    System.out.println(s2.trim());
    System.out.println(str.concat(s2));


    StringBuffer b1=new StringBuffer("heoolooo");
    System.out.println(b1);
    System.out.println(b1.length());
    System.out.println(b1.charAt(2));
    b1.setCharAt(2, 'f');
    System.out.println( b1.delete(5, 7));
    //toString()=>override=>object =>class name +hascode =>fully classified name
//class 
    byte ar[]={47,48,49,50};

    
 }   
}
