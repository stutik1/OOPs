package Recursions;

public class PrintNumber {
    public static void printNumber(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String args[]){
        int n=1;
        printNumber(n);
    }
}
