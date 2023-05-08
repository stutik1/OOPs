package OOPS;

public class ImmutableString {
    public static void main(String args[]){
        String str = "value1";
        str.concat("value2");
        System.out.println(str);

        String concat = str.concat("value2");
        System.out.println(concat);


        // String buffer
        StringBuffer str1 = new StringBuffer("value1");
        String str2 = "value2";
        for (int i =0;i<10;i++){
            System.out.println(str1.append(str2));
        }

        //subString Method
        System.out.println("abcdefghijk".substring(3));
    }
}
