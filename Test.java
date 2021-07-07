import java.util.Stack;

import jdk.incubator.jpackage.main.Main;
public class Test {
 static   public void operation(Stack<Character> op, Stack<Integer> st){
char currop=' ';
        while(op.peek()=='+' || op.peek()=='-'){
                        currop=op.peek();
                      op.pop();
                        if(currop=='+'){
                            int a=st.peek();
                            int b=0;
                            st.pop();
                            if(st.empty()==true){
                                st.push(a);
                            }
                            else{
                                b=st.peek();
                                st.pop();
                            }
                            st.push(a+b);
                        }
                        else if(currop=='-'){
                            int a=st.peek();
                            int b=0;
                            st.pop();
                            if(st.empty()==true){
                                st.push(-1*a);
                            }
                            else{
                                b=st.peek();
                                st.pop();
                            }
                            st.push(b-a);
                        }
                    }
    }
 static   public int calculate(String s) {
        Stack<Integer> st=new Stack<Integer>();
        Stack<Character> op=new Stack<Character>();
        
        
        int i=0;
        char currop=' ';
        while(i<s.length()){
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='('||s.charAt(i)==')'){
                
                if(op.empty()==true){
                    op.push(s.charAt(i));
                }
                else if(s.charAt(i)=='('){
                    op.push(s.charAt(i));
                }
                else if(s.charAt(i)==')'){
                   operation(op,st);
                    st.pop();
                }
                else if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                    operation(op,st);
                    op.push(s.charAt(i));
                }
                
            }
            else{
                String temp=" ";
                while((i)<s.length()&&(s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)=='('&&s.charAt(i)==')'&&s.charAt(i)!=' ')){
                System.out.println(s.charAt(i));
                    temp=temp+s.charAt(i);
                    i++;
                }
                System.out.println(temp);
                        temp=temp.trim();
                        int number=Integer.parseInt(temp);
                      st.push(number);
                    i--;
            }
            i++;
        }
        
        while(op.empty()!=true){
            operation(op,st);
                  
        }
        
        return st.peek();
    }
public static void main(String[] args) {
    String s="1+1";   
    calculate(s);
}
}