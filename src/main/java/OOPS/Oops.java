package OOPS;

class Pen{
    String color;
    String type;

    void write(){
        System.out.println("writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Oops {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpen";

        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();

/////////// For Student class /////////
        Student s1 = new Student();
        s1.name = "Stuti";
        s1.age = 27;

        s1.printInfo();
    }
}
