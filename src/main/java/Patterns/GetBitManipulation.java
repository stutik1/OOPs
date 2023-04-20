package Patterns;

public class GetBitManipulation {
    public static void main(String args[]){
        int pos=3;
        int n=5;
        int bitMask = 1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was 1");
        }
    }
}
