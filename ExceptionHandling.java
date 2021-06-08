import org.graalvm.compiler.lir.gen.ArithmeticLIRGenerator;

//errors
//abnormal conditions
//normal route
//home=>cab=>airport=>plane=>airport(banglore)=>bus stand=>bus=>hotel=>cab=>location=>interview
//home=>cab=>airport=>(ticket)=>half an hour
//home(ticket)=>cab =>airport=>plane=>airport(bnaglore)=>bus stand=>bus=>hotel(resume check =>print extra)=>cab =>location=>(no resume)(no interview)
//check extra= avoid better handle

class ExceptionHandling{

    static void taskAtServer(int userFirstInput,int userSecondInput) throws ArithmeticException {
        System.out.println("Processing _SERVER::Iam server and working on your request");
        try{
            System.out.println("Processing_SERVER:: connection with dB openned");
            int divideResult=userFirstInput/(userSecondInput);
            System.out.println("Processing _Server:: Iam reading from Database");
            System.out.println("Processing _SERVER:::Task done server.");
        // catch(Exception e){


          //   System.out.println("Processing_Server:: Exception in DB1");
            // System.out.println("Processing_SERVER:: connection with dB2 openned");
            // int divideResult=userFirstInput/userSecondInput;
            // System.out.println("Processing _Server:: Iam reading from Database2");

            //e.printStackTrace();
        //}
        }
        finally{
            System.out.println("Processing _SERVER :: DB1 connection closed");
        }
        ////
        ///        
        
    }
    static void gui() throws ArithmeticException{
      // try{
       // int a=90/0;
    //    }
    //    catch(Exception ex){
    //        System.out.println("nothing to display");
    //    }
        System.out.println("GUI:  Task initiated......");
        int userFirstInput=12;
        int userSecondInput=0;
        try{
        taskAtServer(userFirstInput,userSecondInput);
        System.out.println("GUI:: task output received at gui");
        }
        catch(ArithmeticException e){
        System.out.println("Gui: Your request can not be fulfilled");
        e.printStackTrace();
        }
       
    }
public static void main(String[] args) {
    gui();
//     try{
//    gui();
//     }
//     catch(ArithmeticException e){
//         try{
//         gui();
//         }
//         catch(ArithmeticException ex1){
//             try{
//                 gui();
//             }
//             catch(ArithmeticException ex2){
//                 System.out.println("Main :Gui ,Sorry request cannot be fulfilled at the moment");
//             }
//         }

//     }
   System.out.println("GUI_SERVER::Now you can leave,....");

}
}