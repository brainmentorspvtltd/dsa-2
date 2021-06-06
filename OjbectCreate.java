//gconsole
//

class ThreadMaker extends Thread{
    public void run(){
        for(;true;){
            String s=new String("abc");
        }
    }
}

public class OjbectCreate {
 public static void main(String[] args) {
     ThreadMaker t1=new ThreadMaker();
     ThreadMaker t2=new ThreadMaker();
     ThreadMaker t3=new ThreadMaker();
     ThreadMaker t4=new ThreadMaker();
     ThreadMaker t5=new ThreadMaker();
     ThreadMaker t6=new ThreadMaker();
     t1.start();
     t2.start();
     t3.start();
     t4.start();
     t5.start();
     t6.start();
 }   
}
