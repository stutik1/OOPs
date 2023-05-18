package initializationBlock;

public class StaticInitializerExample {
    static int count;

    static {
        System.out.println("Static Initializer");
        count += 1;
        System.out.println("count when instance initializer is run: " + count);
    }

    public static void main(String[] args) {
        StaticInitializerExample example = new StaticInitializerExample();
        StaticInitializerExample example1 = new StaticInitializerExample();
        StaticInitializerExample example2 = new StaticInitializerExample();
    }
}
