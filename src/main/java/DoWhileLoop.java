import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number:");
             number = scan.nextInt();
            System.out.println(number);
        } while (number>=0);
        System.out.println("The End ");
    }
}
