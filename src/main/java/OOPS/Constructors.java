package OOPS;

public class Constructors {

    // non parameterized
    class Student {
        String name;
        int age;

        Student() {
            System.out.println("Constructor called");
        }
    }

    // parametrized constructor

    class Student1 {
        String name;
        int age;

        Student1(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String args[]){

    }
}
