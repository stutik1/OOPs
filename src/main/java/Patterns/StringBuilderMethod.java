package Patterns;
import java.util.*;
public class StringBuilderMethod {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Megha");
        System.out.println(sb);

      // charAt Method
        System.out.println(sb.charAt(2));

     //Set method

//       sb.setCharAt(2 ,'d');
//        System.out.println(sb);

    //insert char

//        sb.insert(0, 'S');
//        System.out.println(sb);

    //insert string
        sb.insert(5,"Stuti");
        System.out.println(sb);

    //delete char
        sb.delete(2,3);
        System.out.println(sb);

     // append method -----Append means to add something at the end.
      StringBuilder name = new StringBuilder("Guru ");
        name.append('K');
        name.append('u');
        name.append("mar");
        System.out.println(name);
        System.out.println(name.length());
    }
}
