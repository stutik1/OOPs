package exception;

import java.util.Scanner;

public class FinallyBlockExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                System.out.println("Result: " + (10 / num));
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero" );
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close(); // Ensuring that the scanner is closed
                System.out.println("Scanner closed");
            }
        }
    }
