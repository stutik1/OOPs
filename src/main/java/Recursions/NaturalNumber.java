package Recursions;

public class NaturalNumber {
    public static void naturalNumberSum(int n ,int sum){
        if (n == 0){
           System.out.println(sum);
            return;
        }
        sum =sum+n;
        naturalNumberSum(n-1,sum);
    }

    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printSum(i+1,n,sum);
        //System.out.println(i);
    }
    public static int printSumInt(int n){
        int sum =0;
//        if(n==0){
//            System.out.println(sum);
//        }
//         sum = sum+n;
//        printSumInt(n-1);
//        return sum;

        for(int i =0;i<=n;i++){
            sum = sum+i;
        }
        return sum;
    }

    public static void main(String args[]){
        naturalNumberSum(5,0);
        printSum(1,5,0);
        System.out.println(printSumInt(5));
    }
}
