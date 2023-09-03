package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgAssignment {
    public static void main(String[] arg) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(4);
        input.add(11);
        input.add(21);
        input.add(1);
        input.add(10);
        input.add(7);
        //  Filter Even Numbers: Given a list of integers, use streams to filter and print only the even numbers.
        System.out.print("Filter Even Numbers: ");
        input.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //Find Highest Value: Find the highest value from an array of integers using streams.
        System.out.print("Find Highest Value: ");

        input.stream()
                .max(Integer::compareTo)
                .stream()
                .forEach(x -> System.out.println("Max value :" + x));

        // String Lengths: Given a list of strings, use streams to print the lengths of each string.
        System.out.println("String Lengths: ");
        List<String> stringList = List.of(new String[]{"Ram", "Robert", "Rahim", "Stuti"});
        stringList.stream()
                .map(String::length)
                .forEach(System.out::println);

        stringList.stream()
                .forEach(x -> System.out.println(x + " " + x.length()));


        // * Square Root List: Given a list of doubles, use streams to calculate and print the square root of each number.
        System.out.println("Square Root List: ");
        input.stream()
                .map(Math::sqrt)
                .forEach(System.out::println);

        input.stream()
                .map(x -> Math.sqrt(x))
                .forEach(System.out::println);

        // * Uppercase Strings: Convert a list of strings to uppercase using streams.
        System.out.print("Uppercase Strings: ");
        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        stringList.stream()
                .map(x -> x.toUpperCase())
                .forEach(System.out::println);

        // * Sum of Integers: Calculate the sum of all integers in an array using streams.
        System.out.print("Sum of Integers: ");
        System.out.println(input.stream()
                .reduce(0, Integer::sum));

        //  * Distinct Elements: Given an array of integers, find and print the distinct elements using streams.
        System.out.print("Distinct Elements: ");
        input.stream()
                .distinct()
                .forEach(System.out::println);

        //  * Average of Doubles: Calculate the average of a list of doubles using streams.
        System.out.print("Average");
        double average = input.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(average);

        // * String Concatenation: Given a list of strings, use streams to concatenate them into a single string.
        System.out.println("String Concatenation: ");
        System.out.println(stringList.stream()
                .reduce(String::concat).get());

        System.out.println(stringList.stream()
                .reduce("", (result, str) -> result + str));


        // * Filter Long Words: Filter out and print words from a list of strings that have more than a certain number of characters using streams.
        System.out.print("Filter Long Words: ");
        int minLength = 5;
        stringList.stream()
                .filter(s -> s.length() > minLength)
                .forEach(System.out::println);


        // * Find First Odd Number: Find the first odd number in an array of integers using streams.
        System.out.print("First Odd Number: ");
        input.stream()
                .filter(n -> n % 2 != 0)
                .findFirst()
                .stream()
                .forEach(System.out::println);


        // * Grouping Strings by Length: Group a list of strings by their lengths using streams and print the results.
        System.out.print("Grouping Strings by Length: ");

        stringList.stream()
                .map(s -> s.length())
                .sorted()
                .forEach(System.out::println);

        // * Mapping to Objects: Given a list of integers, create a list of corresponding objects using streams.


        // * Partitioning Integers: Partition a list of integers into even and odd numbers using streams and print the partitions.



        // * Sort and Limit: Given a list of strings, sort them alphabetically and print the first n strings using streams.
        System.out.print("Sort and Limit: ");
        int n = 2;
        Integer x=0;
        stringList.stream()
                .sorted()
                .limit(n)
                .forEach(System.out::println);
    }
}
