package functional;

import java.util.Arrays;

public class SortedString {
    public static void main(String[] args){
        Arrays.stream(new String[]{"Ram","Robert","Rahim","Stuti"})
                .filter(s-> s.startsWith(""))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);

    }
}
