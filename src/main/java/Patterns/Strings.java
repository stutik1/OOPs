package Patterns;

public class Strings {
    public static void main(String args[]) {
        // Concatenate method in string
        String name1 = "Stuti";
        String name2 = "Megha";
        String name3 = name1 +" " + name2;

        System.out.println(name3);
        // Length method
        System.out.println(name3.length());

        // String concat() method
        System.out.println(name1.concat(name2));

        // charAt function in string
        for(int i=0;i<name3.length();i++) {
            System.out.println(name3.charAt(i));
        }

        // CompareTo method
        if(name1.compareTo(name2)==0){
            System.out.println("String are equals");
        }else{
            System.out.println("Strings are not equals");
        }
   // Equal method

        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
   // create new string with == method

        if(new String("megha") == new String("megha")){
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }


        // replace method
        String name4 = name1.replace('t', 'a');
        // System.out.println(name1.replace('t' ,'a'));
        System.out.println(name4);
        System.out.println(name1); // there is no changes in original string... only changes in new string bcz String is immutable

        // substring
        String name5 = "Megha and Guru";
        System.out.println(name5.substring(0, 5));
        System.out.println(name5.substring(10)); // by default it will get the last index

        //equal method
        String s1 = "megha";
        String s2 = new String("megha");
        String s3 = "megha";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

       // ParseInt method
        String str = "123";
        int number = Integer.parseInt(str);
        double num = Double.parseDouble(str);
        System.out.println(num);
        System.out.println(number);

       // ToString Method
        int numbers = 123;
        String s = Integer.toString(numbers);
        System.out.println(s.length());

    }
}
