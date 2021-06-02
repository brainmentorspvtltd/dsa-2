import java.io.*;
import java.util.Scanner;


public class Input {
    public static void main(String[] args) throws IOException{
        //most common way to take input
        // Scanner sc=new Scanner(System.in);
        // int input1=sc.nextInt();
        // String s=sc.nextLine();
        // char c=sc.next().charAt(0); 
        // //
        
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String s=reader.readLine();
        System.out.print(s);

    }
}
