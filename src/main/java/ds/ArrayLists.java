package ds;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<Integer>();

       // add elements
       list.add(7);
       list.add(5);
       list.add(3);
        System.out.println(list);

        // get elements
        int elements = list.get(1);
        System.out.println(elements);

        // add elements in between
        list.add(1,6);
        System.out.println(list);

        // set elements
        list.set(1,10);
        System.out.println(list);

        // delete ele

        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());
    }
}
