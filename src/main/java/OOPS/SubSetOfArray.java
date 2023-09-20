package OOPS;

public class SubSetOfArray {
    private static boolean subSetOfArray(int arr1[], int arr2[]) {
        int j;
        int n = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            for (j = 0; j < n; j++)
                if (arr2[i] == arr1[j]) {
                    break;
                }
            if (j == n) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7,8};
        System.out.println(subSetOfArray(arr1, arr2));
    }
}
