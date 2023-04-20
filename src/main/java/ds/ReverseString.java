package ds;

public class ReverseString {
    public static String reverse(String s){
        char ch[] = s.toCharArray();
        String rev ="";
        for (int i=ch.length-1;i>=0;i--){
            rev = rev+ ch[i];
        }
        return rev;
    }
    public static void main(String args[]){
        System.out.println(reverse("megha"));
    }
}
