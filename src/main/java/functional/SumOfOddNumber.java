package functional;

import java.util.Arrays;

public class SumOfOddNumber {
    public static void sumOfOddNumber(int[] number){
        int sum=0;
        for (int i=0;i< number.length;i++){
            if(number[i] % 2 != 0){
                sum = sum+number[i];
            }
        }
        System.out.println(sum);
    }

    public static void sumOfOddNumberByFunctionalProgramming(int[] numbers){
        int sumOfOdd = Arrays.stream(numbers).filter(n -> n % 2 != 0).sum();
        System.out.println("Sum of odd numbers by functional programming : " + sumOfOdd);
    }
    public static void main(String[] args){
        int[] number ={1,2,3,4,5,6,7,8,9,};
        sumOfOddNumber(number);
        sumOfOddNumberByFunctionalProgramming(number);
    }
}
