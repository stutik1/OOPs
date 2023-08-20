package OOPS;

public class TestObj {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.name = "Megha";
        s1.id = 1;

        Students s2 = new Students();
        s2.name="Guru";
        s2.id =2;

        Students s3 = new Students();
        s3.id = 1;
        s3.name = "Megha";

        Employee e1 = new Employee();
        e1.name = "Stuti";
        e1.id = 1;

        User user = new User();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


    }
}
