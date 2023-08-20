package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalProgrammingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Predicate Interface
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = names.stream()
                .filter(startsWithA)
                .collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + filteredNames);

        // Function Interface
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream()
                .map(toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercased names: " + upperCaseNames);

        // Consumer Interface
        Consumer<String> printGreeting = name -> System.out.println("Hello, " + name);
        names.forEach(printGreeting);

        // Supplier Interface
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
        int randomNumber = randomNumberSupplier.get();
        System.out.println("Random number: " + randomNumber);
    }
}
