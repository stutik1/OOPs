package exception;

/**
 * Unchecked exceptions, also known as runtime exceptions, are not checked at compile-time.
 * They typically indicate programming bugs or logic errors and are subclasses of the RuntimeException class.
 * In this example, we attempt to access an element at index 5 in an array that has only 3 elements.
 * This results in an ArrayIndexOutOfBoundsException.
 */

public class UnCheckedExceptionExample {
    public static void main(String[] args){
        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Index Out of Bound : " + e.getMessage() );
            e.printStackTrace();
        }
    }
}
