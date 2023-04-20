import java.util.Arrays;

public class AraaysInJava {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] =97;
        marks[1] =99;
        marks[2] =88;
        System.out.println(marks[0]);
        System.out.println(marks);

        //length
        System.out.println(marks.length);

        // sort
        System.out.println(marks[2]); // without sorting
        Arrays.sort(marks);
        System.out.println(marks[2]); // after sorting

        //2D Arrays
        int[][] result = {{99,95,96}, {87,99,98}};
        System.out.println(result[1][0]);
    }
}
