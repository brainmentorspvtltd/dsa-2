public class FinallyKey {
    public static void main(String[] args) {
        try{
            int sum=34/0;
            //int sum2=34/10;
        }
        catch(Exception e){
            System.out.println("exception is there");
        }
        finally{
            //it always has to run
            //clean up
            //mandatory task
            System.out.println("iam finally block");
        }

    }
}
