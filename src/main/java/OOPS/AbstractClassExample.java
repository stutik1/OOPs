package OOPS;

// Abstract class definition
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method without implementation
    abstract void makeSound();

    // Concrete method with implementation
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass of the abstract class
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

// Subclass of the abstract class
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says Meow!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        dog.sleep();

        Cat cat = new Cat("Whiskers");
        cat.makeSound();
        cat.sleep();
    }
}
