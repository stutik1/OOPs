package ds;

import java.util.HashMap;

public class GoodPairCount {
    public static int usingBruteForce(int[] num){
        int count =0 ;
        for (int i=0 ;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] == num[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static int usingHahMap(int[] num){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i=0;i< num.length;i++){
            if (hash.containsKey(num[i])){
                hash.put(num[i],hash.get(num[i])+1);
            }else
                hash.put(num[i],1);
        }
        int count=0;
        for (int i=0;i< num.length;i++){
            int freq= hash.get(num[i]);
            count=count+(freq-1);
            hash.put(num[i],freq-1);
        }
        return count;
    }
    public static void main(String args[]){
       int num[]={1,2,3,1,1,3} ;
       System.out.println("Using Brute force "+usingBruteForce(num));
        System.out.println("Using HashMap "+usingHahMap(num));
    }
}
