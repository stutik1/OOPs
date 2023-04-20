package ds;

import java.util.Arrays;

public class TargetSum {
    static void printPairs(int arr[], int sum)
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == sum)
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
    }

    public static void main(String[] arg)
    {
        int arr[] = { 1, 5, 7, -1, 5 };
        int sum = 6;
        printPairs(arr, sum);
    }
}
