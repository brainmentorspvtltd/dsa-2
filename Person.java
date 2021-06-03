package classesExample;
class Person{
//private Person 
//right now our main method is in Person class hence it will be able to access the private 
//members also
//but usually class having main method will be a differrent class
//private =>data members
    String name;
    int height=60;
    int weight=5;
    String  phone;
    int age;
    String address;

    //public memeber function
    void insertIntoState(String n,int h,int w,String p,int a, String add ){
        this.name=n;
        this.height=h;
        this.weight=w;
        this.phone=p;
        this.age=a;
        this.address=add;
    
        
    }
    void setAge(int a){
        if(a>100 || a<0){
            this.age=this.age;
        }
        else{
            this.age=a;

        }
    }
    void printDetails(){
        System.out.println("name of Person :"+this.name);
        System.out.println("age of person :"+this.age);
        System.out.println("height of person :"+this.height);
        System.out.println("weight of the person :"+this.weight);
        System.out.println("phone number of the person :"+this.phone);
        System.out.println("Address of the person :"+this.address);
        System.out.println("-------------------------------------------------");
    }
    public static void main(String[] args) {
        Person ram=new Person();
        Person shyam=new Person();
        ram.insertIntoState("ram",168,75,"134256",45,"c blpck");
        shyam.insertIntoState("shyam",170,86,"67890",90,"d blpck");
        //to access all the attributes you should have a setter and a getter function individually
        ram.setAge(-90);
        shyam.setAge(-56);
        // ram.age=-90;
        // shyam.age=-23;
        ram.printDetails();
        shyam.printDetails();
        //int a;
        // ram.name="ram";
        // ram.height=168;
        // ram.weight=75;
        // ram.phone="12234667";
        // ram.age=45;
        // ram.address="abc block";

        
        // shyam.name="shyam";
        // shyam.height=170;
        // shyam.weight=80;
        // shyam.phone="234567";
        // shyam.age=78;
        // shyam.address="third block";

        // System.out.println("name of Person :"+ram.name);
        // System.out.println("age of person :"+ram.age);
        // System.out.println("height of person :"+ram.height);
        // System.out.println("weight of the person :"+ram.weight);
        // System.out.println("phone number of the person :"+ram.phone);
        // System.out.println("Address of the person :"+ram.address);
        // System.out.println("----------------------------------------");
        // System.out.println("name of Person :"+shyam.name);
        // System.out.println("age of person :"+shyam.age);
        // System.out.println("height of person :"+shyam.height);
        // System.out.println("weight of the person :"+shyam.weight);
        // System.out.println("phone number of the person :"+shyam.phone);
        // System.out.println("Address of the person :"+shyam.address);

    }
}