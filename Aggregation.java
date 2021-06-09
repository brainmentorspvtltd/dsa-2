
class Engine{
    int capacity;
    int type;
    int fuelType;
    Engine(int capacity,int type,int fuelType){
        this.capacity=capacity;
        this.type=type;
        this.fuelType=fuelType;
    }
}

class Car{
    Engine e;
    String color;

    Car(Engine e, String color){
        this.e=e;
        this.color=color;
    }

}
class Aggregation{
    public static void main(String[] args) {
        Engine e1=new Engine(1,2,3);
        Engine e2=new Engine(3,34,5);
        Engine e3= new Engine(6,6,8);

        Car c1=new Car(e1,"green");
        Car c2=new Car(e1,"yellow");
        Car c3=new Car(e3,"red");
    }
}