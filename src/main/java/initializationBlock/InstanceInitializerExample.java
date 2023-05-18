package initializationBlock;

public class InstanceInitializerExample {
    private int count;
    {
        System.out.println("Instance Initializer");
        count +=1;
        System.out.println("count when instance initializer is run: "+ count );
    }
    public static void main(String[] args){
        InstanceInitializerExample example = new InstanceInitializerExample();
        InstanceInitializerExample example1 = new InstanceInitializerExample();
        InstanceInitializerExample example2 = new InstanceInitializerExample();
    }
}
