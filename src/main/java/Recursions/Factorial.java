package Recursions;

public class Factorial {
    public static void printFactorial(int n,int factorial){
        if(n==0){
            System.out.println(factorial);
            return;
        }
         factorial = n*factorial;
        printFactorial(n-1,factorial);
    }

    /// Another way to find
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int number = factorial(n-1);
        int fac= number*n ;
        return fac;

    }

    public static void main(String args[]){
        printFactorial(5,1);

        System.out.println(factorial(5));
    }
}
