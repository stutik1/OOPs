package ds;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            int j;
            for(j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                   break;
                }
            }
            if(j==t.length()){
                return false;
            }
        }
        return true;
    }
    public static boolean usingSorting(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] String1= s.toCharArray();
        char[] String2 = t.toCharArray();
            Arrays.sort(String1);
            Arrays.sort(String2);
              return Arrays.equals(String1,String2);
        }
   public static boolean usingSorting2(String s, String t){
        if(s.length() != t.length()) {
            return false;
        }
            char[] String1 = s.toCharArray();
            char[] String2 = t.toCharArray();
            Arrays.sort(String1);
            Arrays.sort(String2);
            for(int i=0;i<s.length();i++){
                if(String1[i] != String2[i] ){
                    return false;
                }
            }
        return true;
   }

  // public static boolean usingHashMap(String s ,String 2)

    public static void main(String[] args){
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(usingSorting("megha","stuti"));
        System.out.println(usingSorting2("guru","urug"));
        }
    }


