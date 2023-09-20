package OOPS;

public class StaticExample {
    static int a = 10; // static variable

    public static int add (int a , int b){ // static method
       return a+b;
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticExample.add(10,25));
    }
}
