package StreamExample;

import java.util.function.BiFunction;
/*The BiFunction Interface is a part of the java.util.function package which has been introduced since Java 8,
to implement functional programming in Java. It represents a function which takes in two arguments and produces
a result. Hence this functional interface which takes in 3 parameters namely:-

        T: denotes the type of the first argument to the function
        U: denotes the type of the second argument to the function
        R: denotes the return type of the function
        The lambda expression assigned to an object of BiFunction type is used to define its apply()
        which eventually applies the given function on the arguments. The main advantage of using a BiFunction is
        that it allows us to use 2 input arguments while in function we can only have 1 input argument.
      */
class BiFunctionalEx {
    public static void main(String[] args) {
        // BiFunction to demonstrate composite functions
        // Here it will find the sum of two integers
        // and then return twice their sum
        BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b;

        // Using addThen() method
        //composite1 = composite1.addThen(a -> 2 * a);

        // Printing the results
        System.out.println("Composite1 = " + composite1.apply(2, 3));

        // BiFunction to demonstrate composite functions
        // Here it will find the sum of two integers
        // and then return twice their sum
        BiFunction<Integer, Integer, Integer> composite2 = (a, b) -> a * b;

        // Using addThen() method
        //composite2 = composite2.addThen(a -> 3 * a);

        // Printing the result
        System.out.println("Composite2 = " + composite2.apply(2, 3));
    }
}