package Patterns;

public class SetBitManipulation {
    public static void main(String  args[]){
        int n =5;
        int pos =1;
        int bitmask= 1<<pos;
        int number = bitmask | n;
        System.out.println(number);
        if((bitmask | n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
        System.out.println(number);
    }
}
