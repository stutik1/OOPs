package OOPS;

public class Polymorphism {
    public static void main(String args[]){

    }
    // overloading
    class Student {
        String name;
        int age;

        public void displayInfo(String name) {
            System.out.println(name);
        }


        public void displayInfo(int age) {
            System.out.println(age);
        }

        public void displayInfo(String name, int age) {
            System.out.println(name);
            System.out.println(age);
        }
    }

}
