package OOPS;

import java.util.Arrays;

public class CommonPrefixString {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        Arrays.sort(strs);
        String strs1 = strs[0];
        String strs2 = strs[strs.length-1];
        int index =0;

        while(index < strs1.length()){
            if(strs1.charAt(index) == strs2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return strs1.substring(0,index);
    }

    public static void main(String[] args){
        String[] s = {"flower","flow","flight"};
        System.out.println(CommonPrefixString.longestCommonPrefix(s));
    }
}
