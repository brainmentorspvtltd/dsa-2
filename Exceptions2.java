
class UnderAge extends Exception{
    UnderAge(){
        super("this candidate does not fulfill the age barrier");
    }
}


public class Exceptions2 {
    static void add(){
        if(90>0){
        System.out.println("add");
        return ;
        }
        else{
            
        }
        System.out.println("sub");
    }
    public static void main(String[] args) {
        add();
        int age=26;
        try{
           
            if(age>25){
               // return;
               System.exit(0);
            }
            else{
                UnderAge u=new UnderAge(); 
                throw u;
            }
        }
        catch(UnderAge u){
            System.out.println(u.getMessage());
        }
        finally{
            System.out.println("in finally");
        }
        
    }
}
