package ds;

public class UniqueChar {
    public static void BruteForce (String str){
        for(int i=0;i<str.length();i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str + " not unique");
                    return;
                }
            }
        }
            System.out.println(str+" unique");
        }

    public static void usingCharAt(String str){
        int[] freq = new int[26];
        for (int i=0;i<str.length();i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int i;
        for (i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println(str+" is not unique");
                //break;
                return;
            }
        }
        //if(i==freq.length){
            System.out.println(str+" Char is unique");
        //}
    }

    public static void usingCharArray(String str){
        int[] freq = new int[26];
        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            freq[ch[i] - 'a' ]++;
        }
        for (int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println(str+" is not unique");
                return;
            }
        }
        System.out.println(str + "unique");
    }

    public static void usingForEach(String str) {
        int[] freq = new int[26];
        for (char ch:str.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i : freq){
            if(freq[i] > 1) {
                System.out.println(str + " is not unique");
            }
        }
        System.out.println(str + " unique");
    }

        public static void main(String args[]){
        usingCharAt("megha");
        usingCharArray("guru");
        BruteForce("stuti");
        usingForEach("sonal");

    }
}
