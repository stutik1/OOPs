package OOPS;

public class Calculator {
    private String name ;

    public Calculator(String name){
        this.name=name;
    }
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }

    public int multiply(int a ,int b){
        return a*b;
    }
    public String calculatorName(){
        return name;
    }
}
