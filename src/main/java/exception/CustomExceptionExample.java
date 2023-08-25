package exception;

/**
 * We can also create our own custom exceptions by extending the Exception class or its subclasses.
 * This can be helpful when you want to handle specific error scenarios in your program.
 * In this example, we create a custom exception class MyCustomException by extending the Exception class.
 * We then throw and catch this custom exception in the main method.
 */

class MyCustom extends Exception{
    public MyCustom(String message){
        super(message);
    }
}
public class CustomExceptionExample {
    public static void main(String[] args){
        try {
            throw new MyCustom("This is a custom exception.");
        }catch (MyCustom e){
            System.out.println("Custom exception catch :" + e.getMessage()) ;
            e.printStackTrace();
        }
    }
}
