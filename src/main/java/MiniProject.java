import java.util.Scanner;

public class MiniProject {
    // Create random number
    // get an input by user between 1 to 100
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("Guess my Number ");
             userNumber = scan.nextInt();
            if (userNumber == myNumber){
                System.out.println("Awesome");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your Number Is Too Large");
            }
            else {
                System.out.println("Your Number is Too Small");
            }
        }
        while (userNumber >= 0);{
            System.out.println("The End");
            System.out.println("My Number is :" + myNumber);
        }
    }
}
