package OOPS;

/**\
 * a variable-length argument list, often referred to as "varargs," allows you to pass a variable number of arguments of the same type to a method.
 * This feature simplifies method calls when you need to handle a flexible number of arguments without having to create an array explicitly.
 * Varargs are particularly useful when you don't know how many arguments we'll need to pass to a method in advance or
 * when we want to provide a convenient way for users of your methods to supply multiple values.
 */
public class VariableArgument {
    public static int varArgsExample(int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum+=number;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] sum = {1,2,3};
        System.out.println(varArgsExample(sum));

        int sum2 = varArgsExample(1,2,3,4);
        System.out.println(varArgsExample(sum2));

        int sum3 = varArgsExample();
        System.out.println(varArgsExample(sum3));
    }
}
