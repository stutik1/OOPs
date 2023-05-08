package OOPS;

public class Loops {
    public static void main(String agrs[]) {
        // multiple statement in initialization or Operation by using commas
        for (int i = 0, j = 0; i < 10; i++, j--) {
            System.out.println(j);
        }

        //break statements take execution out in inner loop

        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.println(i + " " + k);
                if (k == 5) {
                    break;
                }
            }
        }

        // to get out of an outer loop
        outer:
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.println(i + " " + k);
                if (k == 5) {
                    break outer;
                }
            }
        }
    }
}
