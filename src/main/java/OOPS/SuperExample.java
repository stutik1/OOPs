package OOPS;

/**
 * In summary:
 *
 * this refers to the current instance of the class.
 * super refers to the superclass of the class.
 * this is mainly used to differentiate between instance variables and method parameters or to access instance methods and variables.
 * super is often used to access overridden or hidden members of the superclass, or to call superclass constructors.
 */
class Animl {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dg extends Animl {
        @Override
        void makeSound() {
            super.makeSound(); // Calling the overridden method from the superclass
            System.out.println("Dog barks");
        }
    }

    public class SuperExample {
        public static void main(String[] args) {
            Dg dg = new Dg();
            dg.makeSound();
            Animl an = new Animl();
            an.makeSound();
        }
    }


