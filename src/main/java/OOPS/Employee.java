package OOPS;

public class Employee extends User{
    int id ;
    String name ;
    String department;

    @Override
    public String getAddress(){
        return "Paypal";
    }

}
