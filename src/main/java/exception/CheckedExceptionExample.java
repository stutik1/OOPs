package exception;
/**
 * Checked exceptions are exceptions that are checked at compile-time.
 * This means you must either handle them using try-catch blocks or declare them in the method signature using the throws keyword.
 * In this example, the FileInputStream constructor can throw a FileNotFoundException.
 * We handle this exception by enclosing the code that might throw it in a try block and providing a corresponding catch block to handle it.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
    public static void main(String[] args){
        try{
            FileInputStream file = new FileInputStream("megha.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found : " +  e.getMessage());
            e.printStackTrace();
        }
    }
}
