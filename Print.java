package recursion;

public class Print {

    // static void doPrint(int i){
      
    //     if(i==5)
    //     return;

    //     System.out.println("hello");
    //     doPrint(++i);
    // }




//1*2 +2*3 +3*4+4*5 +  (n)(n+1)=> f(n)= (n)(n+1)+f(n-1);

static int patt(int n){

if(n==1)
return 2;

    return n*(n+1)+patt(n-1);
}



    //1+2+3+4+5... n => f(n)= n+f(n-1)

    static int add(int n){

            if(n==1)
            return 1;

        return n+add(n-1);
    }

    static int fact(int n){

        if(n==1)
        return 1;
      
        return n*fact(n-1);

    }
//1,2,3,4,5.....n=> f(n)=   n>1,f(n-1), print(n) &&  n=1,f(n)=1}
//n.....5,4,3,2,1=> f(n)=print(n), f(n-1)
static void printn(int n){


    if(n==1){
        System.out.println(n);
        return; 
    }

    
    printn(n-1);
    System.out.println(n);
}

//"fsdtfyuyiofdfghj" vowels   

//f(s,i)={char(i)==vowel, f(s,i+1)+1
//                    not vowel , f(s , i+1)+0}
static int  vowelsCount(String s,int i){

    if(s.length()==i){
        return 0;
    }

    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        return 1+vowelsCount(s,i+1);
    }
    else{
        return vowelsCount(s,i+1);
    }

    
}
static int fibo(int n){

    if(n==0 || n==1){
        return n;
    }
    return fibo(n-1)+fibo(n-2);
}
//f(n)=
static void permutation(String options,String newString){

    if(newString.length()==3){
        System.out.println(newString);
        return;
    }


    for(int i=0;i<options.length();i++){
        String soption=options.substring(0, i)+options.substring(i+1);
        permutation(soption,newString+options.charAt(i));
    }
    // permutation(s,newString+s.charAt(0));
    // permutation(s,newString+s.charAt(1));
    // permutation(s,newString+s.charAt(2));
}  
    public static void main(String[] args) {


        permutation("abcdgfdfgd","");
        // System.out.println(fibo(6));

        // System.out.println(vowelsCount("ksjflsagoierhgaskfa",0));
        // printn(5) ;
        // System.out.println( patt(3));

        // //doPrint(0);

        // // for(int i=0;true;){
        // //     if(i==10){
        // //         break;
        // //     }
        // //     i++;
        // //     System.out.println("hello");
        // // }
    }
    
}
