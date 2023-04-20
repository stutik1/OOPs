package OOPS;

public class Enum {
    public  enum Seasons{WINTER, SPRING, SUMMER;}

    public static void main(String args[]){
        for (Seasons s : Seasons.values()){
            System.out.println(s);
        }
    }
}
