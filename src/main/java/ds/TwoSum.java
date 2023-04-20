package ds;

import java.util.Arrays;

public class TwoSum {
    public static int[] usingBruteForcetwoSum(int[] num, int target) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (target == num[i] + num[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]){
            int num[]={8,3,4,17,9} ;
            int target= 20;
            System.out.println("Using Brute force "+ Arrays.toString(usingBruteForcetwoSum(num,target)));
        }
    }

