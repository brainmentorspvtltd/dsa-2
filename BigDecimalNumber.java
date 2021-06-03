import java.math.*;
public class BigDecimalNumber {
    public static void main(String[] args) {
        // double d=1.2;
        // d=d-0.8;
        // System.out.println(d);
        // System.out.println(Math.round(d*100.0)/100.0);

        BigDecimal bd=new BigDecimal("123435345.564564563");
        BigDecimal bd2=new BigDecimal("123435345.564564563");
        BigDecimal bd3=bd.add(bd2);
        System.out.println(bd3);
        System.out.println(bd.compareTo(bd2));
        System.out.println(bd.compareTo(bd3));

        BigDecimal b=new BigDecimal("12.34");

        double number=b.doubleValue();
        BigDecimal b2=new BigDecimal("23.45");
        double number2=b2.doubleValue();
        double result=number +number2;
        System.out.println(number+number2);
        System.out.println("sum of two numbers:: "+result);

    
      //  System.out.println(bd);

      BigInteger numberOne=new BigInteger("12334346576");
      BigInteger numberTwo=new BigInteger("11111111111111");
      long one=numberOne.longValue();
      long two=numberTwo.longValue();
      long lResult=one +two;
      System.out.println("result of long number addition "+lResult);


    }
}
