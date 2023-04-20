public class StringMethod {
    public static void main(String[] args){
        // Concatenate method in string
            String name1 = "Stuti";
            String name2 ="Megha";
            String name3 = name1 + " and " + name2;
        System.out.println(name3);

        // String concat() method
        System.out.println(name1.concat(name2));

        // charAt function in string
        System.out.println(name1.charAt(1));

        // Length method
        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.println(name3.length());

        // replace method
        String name4 = name1.replace('t','a');
       // System.out.println(name1.replace('t' ,'a'));
        System.out.println(name4);
        System.out.println(name1); // there is no changes in original string... only changes in new string bcz String is immutable

        // substring
        String name5 = "Megha and Guru" ;
        System.out.println(name5.substring(0,5));

        //equal method
        String s1 = "megha";
        String s2 = new String ("megha");
        String s3 = "megha";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
