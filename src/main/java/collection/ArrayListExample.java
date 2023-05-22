package collection;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
//        l1.add(5);
//        l1.add(6);
//        System.out.println(l1);
//        l1.remove(1);

        for (int i = 0; i <= 5; i++)
            l1.add(i);
            System.out.println(l1);

            l1.remove(2);
            System.out.println(l1);

        }
    }

