package functional;

import java.util.Arrays;

public class IncreaseStudentScore {
    public static void byForLoop(int[] score) {
        int[] arr=new int[score.length];

        for (int i = 0; i < score.length; i++) {
            arr[i] = score[i] + 10;
            System.out.println(arr[i]);
        }
    }

    public static void byFunctionalProgramming(int[] score) {
        int[] x = Arrays.stream(score)
                .map(n -> n + 10)
                .toArray();

        Arrays.stream(x)
                .forEach(System.out::println);
//done
        System.out.println("Another way to print the output");
        int[] Scores = Arrays.stream(score)
                .map(n -> n + 10)
                .toArray();

        Arrays.stream(Scores)
                .forEach(System.out::println);

    }

    public static void passedStudent(int[] score) {
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 59) {
                System.out.println("Not Passed");
            } else {
                System.out.println("Passed");
            }
        }
    }

    public static void main(String[] args) {
        int[] scores = {10, 20, 40, 70, 60};

        byForLoop(scores);

        System.out.println("Functional program");
        byFunctionalProgramming(scores);

        passedStudent(scores);

    }
}
