package ds;

public class Palindrom {
    public static boolean isPalindrome(String s) {
        if(s.length()== 0 ){
            return true;
        }
        String reverse ="";
        for(int i = s.length()-1;i>=0;i--){
            reverse =reverse+ s.charAt(i) ;
        }
        if(s.equals(reverse)){
            return true;
        }
        return false ;
    }


    public static boolean specialPalindrome(String s) {
        if(s.length()== 0 ){
            return true;
        }
        String t = s.toLowerCase();

       // t = t.replaceAll("[^a-zA-Z0-9]", "");
        String reverse ="";
        String orignal="";

        for(int i = t.length()-1;i>=0;i--){
           if(t.charAt(i)>=97 && t.charAt(i)<=122  ){
                reverse +=t.charAt(i) ;
                orignal=t.charAt(i)+orignal;
           }

        }

        if(orignal.equals(reverse)){
            return true;
        }
        return false ;
    }



    public static boolean whileLoopPalindrome(String s) {
    if(s.length()== 0 ){
        return true;
    }
    String t = s.toLowerCase();
    t= t.replaceAll("[^a-zA-Z0-9]", "");
    int i=0;
    int j=t.length()-1;
       while(i<j){
               if(t.charAt(i) != t.charAt(j)) {
                   return false;
           }
        i++;
        j--;
    }
       return true;
}
    public static void main(String args[]){

        //System.out.println(isPalindrome("cc"));
        System.out.println(specialPalindrome("A man, a plan, a canal: Panama"));
        //System.out.println(whileLoopPalindrome("aabb aa"));
    }
}
