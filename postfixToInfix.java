import java.util.Stack;
class postfixToInfix{
    static String postToInfix(String s){
    String res="";
        Stack<String> st=new Stack<String>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' ||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='-'){
                if(st.empty()==false){
                    String a=st.peek();
                    st.pop();
                    String b=st.peek();
                    st.pop();
                    
                    st.push(b+s.charAt(i)+a);
                }
            }
            else{
                st.push(""+s.charAt(i));
            }
        }

        if(s.isEmpty()!=true){
            return st.peek();
        }
        return null;
        

    }
    static String InfixToPostfix(String s){
        String res="";
        Stack<Character> op=new Stack<Character>();
       char Currop=' ';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                    if(op.empty()==true || op.peek()=='('){
                        op.push(s.charAt(i));
                    }
                    else{
                        while(op.empty()==false){
                            if(op.peek()=='+'||op.peek()=='-'||op.peek()=='*'||op.peek()=='/'){
                                    Currop=op.peek();
                                    res=res+Currop;
                                    op.pop();
                                    
                            }
                            else{
                                break;
                            }
                        }
                        op.push(s.charAt(i));
                    }

            }
            else if(s.charAt(i)=='*'||s.charAt(i)=='/'){
                if(op.empty()==true || op.peek()=='(' ||op.peek()=='+' ||op.peek()=='-'){
                    op.push(s.charAt(i));
                }
                else
                {
                    while(op.empty()==false){
                        if(op.peek()=='/' || op.peek()=='*'){
                            Currop=op.peek();
                            res=res+Currop;
                            op.pop();
                            
                        }
                        else{
                            break;
                        }
                    }
                    op.push(s.charAt(i));
                }
            }
            else if(s.charAt(i)=='('){
                op.push(s.charAt(i));
            }
            else  if(s.charAt(i)==')'){
               while(op.peek()!='('){
                Currop=op.peek();
                res=res+Currop;
                op.pop();
                }
                op.pop();
            }
            else{
                res=res+s.charAt(i);
            }
        }

        while(op.empty()!=true){
            res=res+op.peek();
            op.pop();
        }

        
        return res;
    }
    public static void main(String[] args) {
        // String s="345*+235//+";
        // System.out.println(postToInfix(s));

        // String s2="-+/345+4*89";
        // //prefixToInfix();

        String s3="(2+3*4)/5-6";
        String s4=InfixToPostfix(s3);
        System.out.println(s4);
    //    String s4="  1234";
    //    s4=s4.trim();
    //     int i=Integer.parseInt(s4);
    //     System.out.println(i);

        
    }
}
