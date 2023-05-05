package HashCode;

public class Test {
    public static void main(String []arg){
        testPlayer();
        testEmployee();
    }

    private static void testEmployee() {
        Employee emp1 = new Employee("Megha",1,24, "abc" );
        Employee emp2 = new Employee("Guru",2,29,"paypal");
        Employee emp3 = new Employee("Megha",1,24,"paypal");

        boolean x = emp1.equals(emp3);
        System.out.println("equals results=> "+x );
        System.out.println("toString emp1 "+ emp1);
        System.out.println("Hascode @"+Integer.toHexString(emp1.hashCode()));
        System.out.println("toString emp2 "+ emp2);
        System.out.println("Hascode @"+Integer.toHexString(emp2.hashCode()));
        System.out.println("toString emp3 "+ emp3);
        System.out.println("Hascode @"+Integer.toHexString(emp3.hashCode()));



    }

    public static void testPlayer(){
        Player player1 = new Player("Megha");
        Player player2 = new Player("Megha");

        boolean x=player1.equals(player2);
        System.out.println("equals results=> "+x );
        System.out.println("toString player1 "+player1);
        System.out.println("Hascode @"+Integer.toHexString(player1.hashCode()));
        System.out.println("toString player2 "+player2);
        System.out.println("Hascode @"+Integer.toHexString(player2.hashCode()));


    }

}
