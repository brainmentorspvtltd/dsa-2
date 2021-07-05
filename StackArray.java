
class StackA{
    private int top=-1;
    private int stackArr[];

    StackA(){
        this.stackArr=new int[5];
    }
    StackA(int size){
        stackArr=new int[size];
    }

    public void push(int data) throws Exception{
        if(this.top==(stackArr.length-1)){
            throw new Exception("Stack OverFlow");
       
        }
        else{
            this.top++;
            this.stackArr[this.top]=data;
        }
    }
    public void pop() throws Exception{
        if(this.top==-1){
            throw new Exception("stack underflow");
        
        }
        else{
            this.top--;
        }
    }
    public int peek() throws Exception{
        if(top==-1){
            throw new Exception("stack underflow");
        }
        else{
            return this.stackArr[this.top];
        }
    }

    public int size(){
        return this.top;
    }
    public boolean isEmpty(){
        return this.top==-1?true:false;
    }
}
class  StackArray{
    public static void main(String[] args) throws Exception {
        StackA st1=new StackA();
        StackA st2=new StackA(10);

        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.pop();
        System.out.println(st1.peek());
        System.out.println(st1.isEmpty());

        st2.push(34);
        st2.push(45);

    }

}











