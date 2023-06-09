package StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/*Introduced in Java 8, the Stream API is used to process collections of objects.
A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
The features of Java stream are –

A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate
operations can be pipelined. Terminal operations mark the end of the stream and return the result.
Different Operations On Streams-


Intermediate Operations:
------------------------

map: The map method is used to returns a stream consisting of the results of applying
    the given function to the elements of this stream.
List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());

filter: The filter method is used to select elements as per the Predicate passed as argument.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
sorted: The sorted method is used to sort the stream.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());

Terminal Operations:
------------------------

collect: The collect method is used to return the result of the intermediate operations performed on the stream.
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());

forEach: The forEach method is used to iterate through every element of the stream.
List number = Arrays.asList(2,3,4,5);
number.stream().map(x->x*x).forEach(y->System.out.println(y));

reduce: The reduce method is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.

List number = Arrays.asList(2,3,4,5);
int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

Here ans variable is assigned 0 as the initial value and i is added to it .
*/
public class StreamExample {
    static {
        int x=0;
    }
    public static void main(String args[]) {

        // create a list of integers
        intergerExample();
        // create a list of String
        stringExample();

        employeeExmple();

    }

    private static void employeeExmple() {
        Employee megha=new Employee();
        megha.setDepartment("Payment");
        megha.setName("Megha");
        megha.setEmp_id(1);
        megha.setSalary(10000);

        Employee guru=new Employee();
        guru.setDepartment("Admin");
        guru.setName("Guru");
        guru.setEmp_id(2);
        guru.setSalary(500);

        Employee sonal=new Employee();
        sonal.setDepartment("Admin");
        sonal.setName("Sonal");
        sonal.setEmp_id(3);
        sonal.setSalary(100000);

        Employee hr=new Employee();
        hr.setDepartment("HR");
        hr.setName("Varsha");
        hr.setEmp_id(4);
        hr.setSalary(10);

        List<Employee> employees=new ArrayList<Employee>();
        employees.add(megha);
        employees.add(guru);
        employees.add(sonal);
        employees.add(hr);
        employees.stream().filter(employee -> employee.getDepartment().equals("HR")).forEach(System.out::println);

    }

    private static void stringExample() {
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
    }

    private static void intergerExample() {
        List<Integer> number = Arrays.asList(2,3,4,5);

        List<Integer> results=new ArrayList<>();
        for(int x:number){
            if(x%2==0){
                x=x*x;
                results.add(x);
            }
        }
        // demonstration of map method
        List<Integer> square = number.stream().filter(x->x%2==0).map(x -> x*x).
                collect(Collectors.toList());

        System.out.println(square);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->10*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);

    }
}
