public class Methods {
    public static void PrintHello(){
        System.out.println("Hello Java");
    }

    // Print name Method

    public static void PrintName(String name){
        System.out.println(name);
    }

    // Calculate Number

    public static void CalculateNumber(int a,int b){
        int result = a+b;
        System.out.println(result);
    }
    public static void main (String[] args){
        PrintHello();
        PrintHello();
        PrintName("Megha");
        CalculateNumber(1,5);
    }
}
