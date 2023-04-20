import java.util.HashMap;
import java.util.Set;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> hashS = new HashMap<Character,Integer>();

        HashMap<Character,Integer> hashT = new HashMap<Character,Integer>();

        //frequency code
        for(int i=0;i<s.length();i++){

            Character sc=s.charAt(i);
            if(hashS.containsKey(sc)){
                int feq=hashS.get(sc)+1;
                hashS.put(sc,feq);
            }else{
                hashS.put(sc,1);
            }

            Character tc=t.charAt(i);
            if(hashT.containsKey(tc)){
                int feq=hashT.get(tc)+1;
                hashT.put(tc,feq);
            }else{
                hashT.put(tc,1);
            }
        }
        //end

        if(hashS.size()!=hashT.size()){
            return false;
        }

        Set<Character> set=hashS.keySet();

        for(Character key:set){
            if(hashT.get(key)==null){
                return false;
            }
            if(hashS.get(key)!=hashT.get(key)){
                return false;
            }
        }
        return true;
    }
}
