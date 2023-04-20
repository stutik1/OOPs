package ds;

import java.util.Locale;

public class Case {
    public static void main(String args[]){
        String s ="MeGha";
            System.out.println(s.toLowerCase());
            System.out.println(s.toUpperCase());

        String t = "Megha:" ;
        System.out.println(t.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
