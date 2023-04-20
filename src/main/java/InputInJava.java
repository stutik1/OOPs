import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args){
        //take input
        Scanner scan = new Scanner(System.in);
        System.out.println("Input ur age :");
        int age = scan.nextInt();
        float age1 = scan.nextFloat();
        System.out.println(age);
        System.out.println(age1);

        // take string as an input
        System.out.println("Input ur name :");
        String name = scan.next(); // next function is use take an input in string.. it print only token means only single word
        String name2 = scan.next();

        String name1 = scan.nextLine();
        System.out.println(name+" "+name2);
        System.out.print(name1);

    }
}
