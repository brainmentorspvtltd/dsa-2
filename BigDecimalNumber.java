import java.math.*;
public class BigDecimalNumber {
    public static void main(String[] args) {
        double d=1.2;
        d=d-0.8;
        System.out.println(d);
        //  System.out.println(Math.round(d*1.000)/1.000);

        BigDecimal bd=new BigDecimal("123435345.564564563");
        System.out.println(bd);
    }
}
