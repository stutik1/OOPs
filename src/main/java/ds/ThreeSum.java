package ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum {
    public static ArrayList<ArrayList<Integer>> usingArrayList(int[] num ,int target){
        int a=0,b=0,c=0;
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();

        for( int i=0;i< num.length;i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (target == num[i] + num[j] + num[k]) {
                       a=i;b=j;c=k;
                       ArrayList arrayList=new ArrayList<Integer>();
                       arrayList.add(a);
                       arrayList.add(b);
                       arrayList.add(c);
                       result.add(arrayList);
                    }
                }
            }
        }
        return result;
    }

    public static int[] usingBruteForce(int[] num , int target){
        for( int i=0;i< num.length;i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (target == num[i] + num[j] + num[k]) {
                       return new int[]{i,j,k};
                    }
                }
            }
        }
        return null;
    }

    public static int[] usingHashMap(int[] num , int target){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i=0;i<num.length;i++){
            hash.put(num[i],i);
        }
        for(int i=0;i< num.length;i++){
            for (int j=i+1;j< num.length;j++){
                int diff = target-(num[i] + num[j]);
                if (hash.containsKey(diff)){
                    int k = hash.get(diff);
                    return new int[]{i,j,k};
                }
            }
        }
       return null;
    }
    public static void main(String args[]){
        int[] num = { 8,3,4,17,9,13};
        int target = 20;
        System.out.println(Arrays.toString( usingArrayList(num,target).toArray()));

        int [] t=usingBruteForce(num,target);
        System.out.println(Arrays.toString(t));

        int [] t2=usingHashMap(num,target);
        System.out.println(Arrays.toString(t2));
    }
}
