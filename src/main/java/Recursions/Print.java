package Recursions;

public class Print {

    //Print 5 to 1 with Iteration
//        for (int i=5;i>0;i--){
//        System.out.println(i);
//    }

    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
       // printNumber(n+1);
    }
    public static void main(String args[]){
      int n=5;
      printNumber(n);
    }
}
