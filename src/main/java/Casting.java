public class Casting {
    public static void main(String[] args){
        //casting
        double price = 100.00;
        double finalprice = 18.00;
        System.out.println(price+finalprice);

        //Explicit casting
        int p = 100;
        int fp = p+ (int)18.00; // use int to convert double into int
        System.out.println(fp);
    }
}
