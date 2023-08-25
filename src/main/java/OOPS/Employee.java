package OOPS;

public class Employee extends User{
    int id ;
    String name ;
    String department;

    @Override
    public String getAddress(){
        return "Paypal";
    }

    public int getIncome(){
        return salary;
    }

    public int getIncome(int agriculture ,int bonus){
        int income = salary + agriculture + bonus;
        return income;
    }

    public int getIncome(int stock){
        int income = salary+stock;
        return income;
    }
}
